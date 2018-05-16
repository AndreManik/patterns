package patternsP.visitor.element;

import patternsP.visitor.visitor.Visitor;
import patternsP.visitor.visitor.WheelElement;

public class CarElement implements Element {
    private Element[] elements;

    public CarElement() {
        this.elements = new Element[] {
                new WheelElement("front left wheel"),
                new WheelElement("front right wheel"),
                new WheelElement("back left wheel"),
                new WheelElement("back right wheel")
        };
    }
    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}