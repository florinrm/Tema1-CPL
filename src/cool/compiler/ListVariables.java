package cool.compiler;

import org.antlr.v4.runtime.Token;

public class ListVariables extends Expression {
    private String name;
    private String type;
    private Expression expression;


    public ListVariables(String name, String type, Token token) {
        super(token);
        this.name = name;
        this.type = type;
    }

    public ListVariables(Token token, String name, String type, Expression expression) {
        this(name, type, token);
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
