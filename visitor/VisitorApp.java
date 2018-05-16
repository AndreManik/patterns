package patternsP.visitor;

import patternsP.visitor.element.BodyElement;
import patternsP.visitor.element.CarElement;
import patternsP.visitor.element.Element;
import patternsP.visitor.element.EngineElement;
import patternsP.visitor.visitor.HooliganVisitor;
import patternsP.visitor.visitor.MechanicVisitor;
import patternsP.visitor.visitor.Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        BodyElement body = new BodyElement();
        Element engine = new EngineElement();
        CarElement car = new CarElement();

        Visitor visitor = new HooliganVisitor();
        for (int i = 0; i < 3; i++) {
            body.accept(visitor);
            engine.accept(visitor);
            car.accept(visitor);
        }

        Visitor master = new MechanicVisitor();
        while (body.getState() < 100) {
            body.accept(master);
            car.accept(master);
        }
    }
}
