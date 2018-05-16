package patternsP.proxy;

public class RealImage implements Image {
    String file;
    public RealImage(String file) {
        this.file = file;
        load();
    }
    public void load() {
        System.out.println("Loading file " + file);
    }
    @Override
    public void display() {
        System.out.println("View file " + file);
    }
}