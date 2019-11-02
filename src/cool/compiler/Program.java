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

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
