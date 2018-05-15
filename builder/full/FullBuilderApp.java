package patternsP.builder.full;

import patternsP.builder.full.model.Car;
import patternsP.builder.full.model.Director;
import patternsP.builder.full.model.FordMondeoBuilder;

public class FullBuilderApp {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}











