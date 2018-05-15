package patternsP.composite.model;

public class Circle implements Shape {
    private static int count = 1;
    private final int id = count++;
    public void draw() {System.out.println("Circle " + id);}
}