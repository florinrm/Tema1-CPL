package cool.compiler;

import cool.lexer.CoolLexer;
import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.io.IOException;


public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }

        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;

        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;

        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);

            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);
                

            // Test lexer only.
            /*
            tokenStream.fill();
            List<Token> tokens = tokenStream.getTokens();
            tokens.stream().forEach(token -> {
                var text = token.getText();
                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
                
                System.out.println(text + " : " + name);
                System.out.println(token);
            }); */


            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);

            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                            line + ":" + (charPositionInLine + 1) + ", ";

                    Token token = (Token) offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;

                    System.err.println(newMsg);
                    errors = true;
                }
            };

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));

            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }

            var astVisitor = new CoolParserBaseVisitor<ASTNode>() {
                @Override
                public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                    var result = new Program();

                    for (var def : ctx.classesProgram) {
                        ClassNode d = (ClassNode) def.accept(this);
                        result.addClass(d);
                    }

                    return result;
                }

                @Override
                public ASTNode visitLet_variables(CoolParser.Let_variablesContext ctx) {
                    if (ctx.expr() == null) {
                        return new ListVariables(ctx.declare_type().name.getText(),
                                ctx.declare_type().type.getText(), ctx.start);
                    }
                    return new ListVariables(ctx.start, ctx.declare_type().name.getText(),
                            ctx.declare_type().type.getText(), (Expression) visit(ctx.expr()));

                }

                @Override
                public ASTNode visitId(CoolParser.IdContext ctx) {
                    return new Id(ctx.ID().getSymbol());
                }

                @Override
                public ASTNode visitClass_def(CoolParser.Class_defContext ctx) {
                    //return super.visitClass_def(ctx);
                    ClassNode node = new ClassNode(ctx.class_type.getText(),
                            ctx.start);
                    if (ctx.inheritedClass != null) {
                        node.setParent(ctx.inheritedClass.getText());
                    }
                    for (var def : ctx.definition()) {
                        Definition d = (Definition) def.accept(this);
                        node.addDefinition(d);
                    }
                    return node;
                }

                @Override
                public ASTNode visitFunctionDefinition(CoolParser.FunctionDefinitionContext ctx) {
                    FuncDefNode node = new FuncDefNode(ctx.nameFunc, ctx.returnType, (Expression) visit(ctx.body), ctx.start);
                    var params = ctx.params;
                    for (var param : params) {
                        var def = new VarDef(param.name, param.type, ctx.start);
                        def.setType("formal");
                        node.addParam(def);
                    }
                    return node;
                }

                @Override
                public ASTNode visitVariableDefinition(CoolParser.VariableDefinitionContext ctx) {
                    if (ctx.initVal == null)
                        return new VarDef(ctx.declare_type().name, ctx.declare_type().type, ctx.start);
                    return new VarDef(ctx.declare_type().name, ctx.declare_type().type,
                            (Expression) visit(ctx.initVal), ctx.start);
                }

                @Override
                public ASTNode visitDeclare_type(CoolParser.Declare_typeContext ctx) {
                    return super.visitDeclare_type(ctx);
                }

                @Override
                public ASTNode visitNegation(CoolParser.NegationContext ctx) {
                    return new UnaryMinusNode((Expression) visit(ctx.expression), ctx.start);
                }

                @Override
                public ASTNode visitCompare(CoolParser.CompareContext ctx) {
                    return new CompareNode((Expression) visit(ctx.leftBranch), ctx.op,
                            (Expression) visit(ctx.rightBranch), ctx.start);
                }

                @Override
                public ASTNode visitVariableAssignment(CoolParser.VariableAssignmentContext ctx) {
                    return new AssignmentNode(ctx.name.getText(), (Expression) visit(ctx.value), ctx.start);
                }

                @Override
                public ASTNode visitVoid(CoolParser.VoidContext ctx) {
                    return new VoidNode(ctx.start, (Expression) visit(ctx.expression));
                }

                @Override
                public ASTNode visitString(CoolParser.StringContext ctx) {
                    return new StringNode(ctx.STRING().getSymbol());
                }

                @Override
                public ASTNode visitMinusPlus(CoolParser.MinusPlusContext ctx) {
                    if (ctx.PLUS() != null) {
                        return new MultDivNode((Expression) visit(ctx.leftBranch), ctx.PLUS().getSymbol(),
                                (Expression) visit(ctx.rightBranch), ctx.start);
                    } else {
                        return new MultDivNode((Expression) visit(ctx.leftBranch), ctx.MINUS().getSymbol(),
                                (Expression) visit(ctx.rightBranch), ctx.start);
                    }
                }

                @Override
                public ASTNode visitParantheses(CoolParser.ParanthesesContext ctx) {
                    return super.visitParantheses(ctx);
                }

                @Override
                public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                    return new WhileNode((Expression) visit(ctx.condition), (Expression) visit(ctx.body), ctx.start);
                }

                @Override
                public ASTNode visitBody(CoolParser.BodyContext ctx) {
                    return super.visitBody(ctx);
                }

                @Override
                public ASTNode visitInt(CoolParser.IntContext ctx) {
                    return new Id(ctx.INT().getSymbol());
                }

                @Override
                public ASTNode visitMulDiv(CoolParser.MulDivContext ctx) {
                    if (ctx.DIV() != null) {
                        return new MultDivNode((Expression) visit(ctx.leftBranch), ctx.DIV().getSymbol(),
                                (Expression) visit(ctx.rightBranch), ctx.start);
                    } else {
                        return new MultDivNode((Expression) visit(ctx.leftBranch), ctx.MUL().getSymbol(),
                                (Expression) visit(ctx.rightBranch), ctx.start);
                    }
                }

                @Override
                public ASTNode visitBoolean(CoolParser.BooleanContext ctx) {
                    return new BoolNode(ctx.BOOL().getSymbol());
                }

                @Override
                public ASTNode visitFunctionCall(CoolParser.FunctionCallContext ctx) {
                    return super.visitFunctionCall(ctx);
                }

                @Override
                public ASTNode visitUnaryNegation(CoolParser.UnaryNegationContext ctx) {
                    return new UnaryMinusNode((Expression) visit(ctx.expression), ctx.start);
                }

                @Override
                public ASTNode visitLet(CoolParser.LetContext ctx) {
                    var variables = ctx.variables;
                    LetNode node = new LetNode((Expression) visit(ctx.body), ctx.start);
                    for (var variable : variables) {
                        node.addVariable((ListVariables) variable.accept(this));
                    }
                    return node;
                }

                @Override
                public ASTNode visitIf(CoolParser.IfContext ctx) {
                    // return super.visitIf(ctx);
                    return new If((Expression) visit(ctx.condition),
                            (Expression) visit(ctx.then_branch),
                            (Expression) visit(ctx.else_branch),
                            ctx.start);
                }

                @Override
                public ASTNode visitCase(CoolParser.CaseContext ctx) {
                    return super.visitCase(ctx);
                }

                @Override
                public ASTNode visitInstantiation(CoolParser.InstantiationContext ctx) {
                    return new NewNode(ctx.start, ctx.TYPE_ID().getText());
                }

                @Override
                public ASTNode visitBranch(CoolParser.BranchContext ctx) {
                    return new Branch(ctx.start, ctx.declare_type().name.getText(),
                            ctx.declare_type().type.getText(), (Expression) visit(ctx.body));
                }
            };

            // must do Print tree
            var printTree = new ASTVisitor<Void>() {
                int indent = 0;

                private void printIndent(String str) {
                    for (int i = 0; i < indent; i++)
                        System.out.print("\t");
                    System.out.println(str);
                }

                @Override
                public Void visit(Id id) {
                    printIndent(id.token.getText());
                    return null;
                }

                @Override
                public Void visit(Int intt) {
                    return null;
                }

                @Override
                public Void visit(If iff) {
                    printIndent("if");
                    indent++;
                    iff.getCond().accept(this);
                    iff.getThenBranch().accept(this);
                    iff.getElseBranch().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(AddSub sum) {
                    printIndent(sum.getOp().getText());
                    indent++;
                    sum.getLeft().accept(this);
                    sum.getRight().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(Program prog) {
                    printIndent("program");
                    indent++;
                    for (var def : prog.getClasses()) {
                        def.accept(this);
                    }
                    indent--;

                    return null;
                }

                @Override
                public Void visit(MultDivNode prod) {
                    printIndent(prod.getOp().getText());
                    indent++;
                    prod.getLeft().accept(this);
                    prod.getRight().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(BoolNode bool) {
                    printIndent(bool.token.getText());
                    return null;
                }

                @Override
                public Void visit(FunctionCall call) {
                    printIndent("method");
                    indent++;

                    indent--;
                    return null;
                }

                @Override
                public Void visit(CompareNode comp) {
                    printIndent(comp.getOp().getText());
                    indent++;
                    comp.getLeft().accept(this);
                    comp.getRight().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(FloatNode flt) {
                    return null;
                }

                @Override
                public Void visit(FuncDefNode func) {
                    printIndent("method");
                    indent++;
                    printIndent(func.getNameToken().getText());
                    for (var def : func.getParams()) {
                        def.accept(this);
                    }

                    printIndent(func.getRetTypeToken().getText());
                    func.getBody().accept(this);

                    indent--;
                    return null;
                }

                @Override
                public Void visit(UnaryMinusNode minus) {
                    printIndent("not");
                    indent++;
                    minus.getNested().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(VarDef var) {
                    if (var.getType() != null && var.getType().equals("formal")) {
                        printIndent(var.getType());
                    } else {
                        printIndent("attribute");
                    }

                    indent++;
                    printIndent(var.getNameToken().getText());
                    if (var.getTypeToken() != null) {
                        printIndent(var.getTypeToken().getText());
                    }
                    if (var.getInitExpr() != null) {
                        var.getInitExpr().accept(this);
                    }
                    indent--;

                    return null;
                }

                @Override
                public Void visit(AssignmentNode assignmentNode) {
                    printIndent("<-");
                    indent++;
                    printIndent(assignmentNode.getVarName());
                    assignmentNode.getValue().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(ClassNode classNode) {
                    printIndent("class");
                    indent++;
                    printIndent(classNode.getName());
                    if (classNode.getParent() != null) {
                        printIndent(classNode.getParent());
                    }
                    for (var def : classNode.getDefinitions()) {
                        def.accept(this);
                    }
                    indent--;
                    return null;
                }

                @Override
                public Void visit(StringNode stringNode) {
                    printIndent(stringNode.token.getText().replace("\"", ""));
                    return null;
                }

                @Override
                public Void visit(WhileNode whileNode) {
                    printIndent("while");
                    indent++;
                    whileNode.getCondition().accept(this);
                    whileNode.getBody().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(VoidNode voidNode) {
                    printIndent("isvoid");
                    indent++;
                    voidNode.getExpression().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(NewNode newNode) {
                    printIndent("new");
                    indent++;
                    printIndent(newNode.getType());
                    indent--;
                    return null;
                }

                @Override
                public Void visit(LetNode letNode) {
                    printIndent("let");
                    indent++;
                    for (var variable : letNode.getVariables()) {
                        variable.accept(this);
                    }
                    letNode.getBody().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(ListVariables listVariables) {
                    printIndent("local");
                    indent++;
                    printIndent(listVariables.getName());
                    printIndent(listVariables.getType());
                    listVariables.getExpression().accept(this);
                    indent--;
                    return null;
                }

                @Override
                public Void visit(CaseOfNode caseOfNode) {
                    return null;
                }

                @Override
                public Void visit(Branch branch) {
                    return null;
                }
            };

            var ast = astVisitor.visit(tree);
            ast.accept(printTree);

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }
    }
}
