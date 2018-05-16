package patternsP.visitor.visitor;

import patternsP.visitor.element.BodyElement;
import patternsP.visitor.element.CarElement;
import patternsP.visitor.element.EngineElement;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Check the engine");
    }
    @Override
    public void visit(BodyElement body) {
        System.out.println("Master polished body");
        int state = body.getState();
        body.setState(state+10);
        System.out.println("Polished body");
        System.out.println("State: " + body.getState());
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Good smell");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Normal" + wheel.getName());
    }
}