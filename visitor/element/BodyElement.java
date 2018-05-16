package patternsP.visitor.element;

import patternsP.visitor.visitor.Visitor;

public class BodyElement implements Element {
    private int state = 100;
    public void setState(int state) {
        this.state = state;
    }
    public int getState() {
        return state;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}