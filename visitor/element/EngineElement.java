package patternsP.visitor.element;


import patternsP.visitor.visitor.Visitor;

public class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}