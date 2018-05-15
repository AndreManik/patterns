package patternsP.builder.simple.model;

public class CarBuilder {
    private String make = "Default";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    public CarBuilder buildMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}