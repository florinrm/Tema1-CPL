package cool.compiler;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ClassNode extends Expression {
    private ClassNode parent;
    private String name;
    private ArrayList<Definition> definitions;

    public ClassNode(String name, Token token) {
        super(token);
        this.name = name;
        definitions = new ArrayList<>();
    }

    public ClassNode(String name, ClassNode parent, Token token) {
        this(name, token);
        this.parent = parent;
    }

    public void addDefinition(Definition def) {
        definitions.add(def);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
