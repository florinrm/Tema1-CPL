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

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        var ast = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                return super.visitProgram(ctx);
            }

            @Override
            public ASTNode visitClass_def(CoolParser.Class_defContext ctx) {
                //return super.visitClass_def(ctx);
                ClassNode node = new ClassNode(ctx.class_type.getText(),
                        ctx.start);
                ClassNode parentClass = (ClassNode) visit(ctx.parent);
                if (parentClass != null) {
                    node.setParent(parentClass);
                }
                for (var def : ctx.definition()) {
                    Definition d = (Definition) def.accept(this);
                    node.addDefinition(d);
                }
                return node;
            }

            @Override
            public ASTNode visitFunctionDefinition(CoolParser.FunctionDefinitionContext ctx) {
                return super.visitFunctionDefinition(ctx);
            }

            @Override
            public ASTNode visitVariableDefinition(CoolParser.VariableDefinitionContext ctx) {
                return super.visitVariableDefinition(ctx);
            }

            @Override
            public ASTNode visitDeclare_type(CoolParser.Declare_typeContext ctx) {
                return super.visitDeclare_type(ctx);
            }

            @Override
            public ASTNode visitNegation(CoolParser.NegationContext ctx) {
                return super.visitNegation(ctx);
            }

            @Override
            public ASTNode visitCompare(CoolParser.CompareContext ctx) {
                return super.visitCompare(ctx);
            }

            @Override
            public ASTNode visitVariableAssignment(CoolParser.VariableAssignmentContext ctx) {
                return super.visitVariableAssignment(ctx);
            }

            @Override
            public ASTNode visitVoid(CoolParser.VoidContext ctx) {
                return super.visitVoid(ctx);
            }

            @Override
            public ASTNode visitString(CoolParser.StringContext ctx) {
                return super.visitString(ctx);
            }

            @Override
            public ASTNode visitMinusPlus(CoolParser.MinusPlusContext ctx) {
                return super.visitMinusPlus(ctx);
            }

            @Override
            public ASTNode visitParantheses(CoolParser.ParanthesesContext ctx) {
                return super.visitParantheses(ctx);
            }

            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                return super.visitWhile(ctx);
            }

            @Override
            public ASTNode visitBody(CoolParser.BodyContext ctx) {
                return super.visitBody(ctx);
            }

            @Override
            public ASTNode visitFloat(CoolParser.FloatContext ctx) {
                return super.visitFloat(ctx);
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return super.visitInt(ctx);
            }

            @Override
            public ASTNode visitMulDiv(CoolParser.MulDivContext ctx) {
                return super.visitMulDiv(ctx);
            }

            @Override
            public ASTNode visitBoolean(CoolParser.BooleanContext ctx) {
                return super.visitBoolean(ctx);
            }

            @Override
            public ASTNode visitFunctionCall(CoolParser.FunctionCallContext ctx) {
                return super.visitFunctionCall(ctx);
            }

            @Override
            public ASTNode visitUnaryNegation(CoolParser.UnaryNegationContext ctx) {
                return super.visitUnaryNegation(ctx);
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                return super.visitLet(ctx);
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
                return super.visitInstantiation(ctx);
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
                return null;
            }

            @Override
            public Void visit(Int intt) {
                return null;
            }

            @Override
            public Void visit(If iff) {
                return null;
            }

            @Override
            public Void visit(AddSub sum) {
                return null;
            }

            @Override
            public Void visit(Program prog) {
                printIndent("program");
                indent++;
                for (var def : prog.getDefinitions()) {
                    def.accept(this);
                }
                for (var expr : prog.getExpressions()) {
                    expr.accept(this);
                }
                indent--;

                return null;
            }

            @Override
            public Void visit(MultDivNode prod) {
                return null;
            }

            @Override
            public Void visit(BoolNode bool) {
                printIndent("bool " + bool.getValue());
                return null;
            }

            @Override
            public Void visit(FunctionCall call) {
                return null;
            }

            @Override
            public Void visit(CompareNode comp) {
                return null;
            }

            @Override
            public Void visit(FloatNode flt) {
                return null;
            }

            @Override
            public Void visit(FuncDefNode func) {
                return null;
            }

            @Override
            public Void visit(UnaryMinusNode minus) {
                return null;
            }

            @Override
            public Void visit(VarDef var) {
                return null;
            }

            @Override
            public Void visit(AssignmentNode assignmentNode) {
                return null;
            }

            @Override
            public Void visit(ClassNode classNode) {
                printIndent(classNode.getName());
                if (classNode.getParent() != null) {
                    printIndent(classNode.getParent().getName());
                }
                indent++;
                for (var def : classNode.getDefinitions()) {
                    def.accept(this);
                }
                indent--;
                return null;
            }
        };
    }
}
