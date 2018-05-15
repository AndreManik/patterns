package patternsP.observer;

import patternsP.observer.izdatel.MeteoStation;
import patternsP.observer.podpischik.ConcreteObserver;
import patternsP.observer.podpischik.FileObserver;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation meteo = new MeteoStation();
        meteo.addObserver(new ConcreteObserver());
        meteo.addObserver(new FileObserver());
        meteo.setMenegements(25, 760);
        meteo.setMenegements(45, 34);
    }
}









