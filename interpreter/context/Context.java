package patternsP.interpreter.context;

import patternsP.interpreter.iner.Expression;
import patternsP.interpreter.iner.finaled.NumberExpression;
import patternsP.interpreter.iner.intermediate.MinusExpression;
import patternsP.interpreter.iner.intermediate.PlusExpression;

public class Context {
    public Expression evaluate(String string) {
        int pos = string.length()-1;
        while (pos > 0) {
            if (Character.isDigit(string.charAt(pos))){
                pos--;
            } else {
                Expression left = evaluate(string.substring(0, pos));
                Expression right = new NumberExpression(Integer.valueOf(string.substring(pos+1, string.length())));
                char operator = string.charAt(pos);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(string);
        return new NumberExpression(result);
    }
}