package cool.compiler;

public interface ASTVisitor<T> {
    T visit(Id id);

    T visit(Int intt);

    T visit(If iff);

    T visit(AddSub sum);

    T visit(Program prog);

    T visit(MultDivNode prod);

    T visit(BoolNode bool);

    T visit(FunctionCall call);

    T visit(CompareNode comp);

    T visit(FloatNode flt);

    T visit(FuncDefNode func);

    T visit(UnaryMinusNode minus);

    T visit(VarDef var);

    T visit(AssignmentNode assignmentNode);

    T visit(ClassNode classNode);
}
