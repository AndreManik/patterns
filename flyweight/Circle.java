package patternsP.flyweight;

public class Circle implements Shape {
    private int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): drawing the circle with radius " + r);
    }
}