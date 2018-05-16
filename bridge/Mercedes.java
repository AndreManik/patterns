package patternsP.bridge;

public class Mercedes implements Make {
    @Override
    public void setMake() {
        System.out.println("Mercedes ");
    }
}