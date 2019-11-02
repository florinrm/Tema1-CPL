package cool.compiler;

import org.antlr.v4.runtime.Token;

public class VarDef extends Definition {
    private Token nameToken;
    private Token typeToken;
    private Expression initExpr;

    public VarDef(Token name, Token type, Expression init, Token start) {
        super(start);
        nameToken = name;
        typeToken = type;
        initExpr = init;
    }

    public Token getNameToken() {
        return nameToken;
    }

    public void setNameToken(Token nameToken) {
        this.nameToken = nameToken;
    }

    public Token getTypeToken() {
        return typeToken;
    }

    public void setTypeToken(Token typeToken) {
        this.typeToken = typeToken;
    }

    public Expression getInitExpr() {
        return initExpr;
    }

    public void setInitExpr(Expression initExpr) {
        this.initExpr = initExpr;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}