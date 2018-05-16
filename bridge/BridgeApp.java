package patternsP.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car kia = new Sedan(new Kia());
        kia.showDetails();
        Car shkoda = new Hatchback(new Skoda());
        shkoda.showDetails();
        Car meren = new Hatchback(new Mercedes());
        meren.showDetails();
    }
}