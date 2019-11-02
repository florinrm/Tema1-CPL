package cool.compiler;

import org.antlr.v4.runtime.Token;

public class FuncDefNode extends Definition {
    private Token nameToken;
    private Token retTypeToken;
    private Expression body;

    public FuncDefNode(Token nameToken, Token retTypeToken, Expression body, Token start) {
        super(start);
        this.nameToken = nameToken;
        this.retTypeToken = retTypeToken;
        this.body = body;
    }

    public Token getNameToken() {
        return nameToken;
    }

    public void setNameToken(Token nameToken) {
        this.nameToken = nameToken;
    }

    public Token getRetTypeToken() {
        return retTypeToken;
    }

    public void setRetTypeToken(Token retTypeToken) {
        this.retTypeToken = retTypeToken;
    }

    public Expression getBody() {
        return body;
    }

    public void setBody(Expression body) {
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
