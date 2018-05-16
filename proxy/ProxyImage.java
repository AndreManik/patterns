package patternsP.proxy;

public class ProxyImage implements Image {
    String file;
    RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}