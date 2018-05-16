package patternsP.proxy;

import patternsP.proxy.Image;

public class proxyAppVirtual {
    public static void main(String[] args) {
        Image image = new ProxyImage("D:/j");
        image.display();
    }
}





