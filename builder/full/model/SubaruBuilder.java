package patternsP.builder.full.model;

public class SubaruBuilder extends CarBuilder {

    void buildMake() {car.setMake("Subaru");}
    void buildTransmission() {car.setTransmission(Transmission.MANUAL);}
    void buildMaxSpeed() {car.setMaxSpeed(350);}
}
