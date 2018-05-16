package patternsP.interpreter;

import patternsP.interpreter.context.Context;
import patternsP.interpreter.iner.Expression;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1-2+3");
        System.out.println(expression.interpret());
    }
}