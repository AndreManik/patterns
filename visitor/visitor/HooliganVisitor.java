package patternsP.visitor.visitor;

import patternsP.visitor.element.BodyElement;
import patternsP.visitor.element.CarElement;
import patternsP.visitor.element.EngineElement;

public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {

        System.out.println("Started the engine");
    }
    @Override
    public void visit(BodyElement body) {
        int state = body.getState();

        body.setState(state-10);
        System.out.println("Knocked on the hood");
        System.out.println("State: " + body.getState());
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoke in the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Broken wheel" + wheel.getName());
    }
}