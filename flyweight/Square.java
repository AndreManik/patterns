package patternsP.flyweight;

public class Square implements Shape {
    private int a = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): drawing the square with side " + a);
    }
}