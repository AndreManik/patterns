package patternsP.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String name) {
        Shape shape = shapes.get(name);
        if (shape == null) {
            switch (name) {
                case "circle":
                    shape = new Circle();
                    break;
                case "Point":
                    shape = new Point();
                    break;
                case "Square":
                    shape = new Square();
                    break;
            }
            shapes.put(name, shape);
        }
        return shape;
    }
}