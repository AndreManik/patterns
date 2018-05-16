package patternsP.interpreter.iner.finaled;

import patternsP.interpreter.iner.Expression;

public class NumberExpression implements Expression {
    int number;
    public NumberExpression(int number) {
        this.number = number;
    }
    @Override
    public int interpret() {
        return number;
    }
}