package patternsP.builder.simple;

import patternsP.builder.simple.model.Car;
import patternsP.builder.simple.model.CarBuilder;
import patternsP.builder.simple.model.Transmission;

public class SimpleBuilderApp {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                        .buildMake("Mercedess")
                        .buildTransmission(Transmission.AUTO)
                        .buildMaxSpeed(280)
                        .build();
        System.out.println(car);
    }
}





