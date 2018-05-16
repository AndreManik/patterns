package patternsP.interpreter.iner.intermediate;

import patternsP.interpreter.iner.Expression;

public class PlusExpression implements Expression {
    Expression left;
    Expression right;
    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret() {
        return right.interpret() + left.interpret();
    }
}