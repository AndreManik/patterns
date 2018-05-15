package patternsP.composite.model;

public class Square implements Shape {
    private static int count = 1;
    private final int id = count++;
    public void draw() {System.out.println("Square " + id);}
}
