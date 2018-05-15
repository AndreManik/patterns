package patternsP.decorator;

import patternsP.decorator.model.*;

public class DecoratorApp {

    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(new Printer("New decorator")))));
        printer.print();
    }
}









