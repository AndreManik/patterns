package patternsP.flyweight;

import java.util.*;

public class flyweightApp {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(factory.getShape("Square"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("Square"));
        shapes.add(factory.getShape("Point"));
        shapes.add(factory.getShape("circle"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);

            shape.draw(x, y);
        }
    }
}


