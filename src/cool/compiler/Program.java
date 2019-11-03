package cool.compiler;

import java.util.ArrayList;

public class Program extends ASTNode {
    private ArrayList<Definition> definitions = new ArrayList<>();
    private ArrayList<Expression> expressions = new ArrayList<>();

    public Program() {
        super();
    }

    public void addDefinition(Definition def) {
        definitions.add(def);
    }

    public void addExpression(Expression expr) {
        expressions.add(expr);
    }

    public ArrayList<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(ArrayList<Definition> definitions) {
        this.definitions = definitions;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
