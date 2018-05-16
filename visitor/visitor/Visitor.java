package patternsP.visitor.visitor;

import patternsP.visitor.element.BodyElement;
import patternsP.visitor.element.CarElement;
import patternsP.visitor.element.EngineElement;

//visitor
public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
    void visit(CarElement car);
    void visit(WheelElement wheel);
}
