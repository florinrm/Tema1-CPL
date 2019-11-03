package cool.compiler;

import org.antlr.v4.runtime.Token;

public class LetNode extends Expression {

    protected LetNode(Token token) {
        super(token);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
