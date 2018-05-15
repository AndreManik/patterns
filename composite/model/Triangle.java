package patternsP.composite.model;

public class Triangle implements Shape {
    private static int count = 1;
    private final int id = count++;
    public void draw() {System.out.println("Triangle " + id);}
}