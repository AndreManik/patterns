package patternsP.composite;

import patternsP.composite.model.*;

public class CompositeApp {
    public static void main(String[] args) {
        Shape square1   = new Square();
        Shape triangle1 = new Triangle();
        Shape circle1   = new Circle();

        Shape square2   = new Square();
        Shape triangle2 = new Triangle();
        Shape circle2   = new Circle();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(triangle1);
        composite1.addComponent(circle1);

        composite2.addComponent(square2);
        composite2.addComponent(triangle2);
        composite2.addComponent(circle2);

        composite3.addComponent(composite1);
        composite3.addComponent(composite2);
        composite3.addComponent(new Triangle());
        composite3.addComponent(new Square());

        composite3.draw();
    }
}









