package patternsP.observer.izdatel;

import patternsP.observer.podpischik.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable {
    private int temp;
    private int presser;

    List<Observer> observerList = new ArrayList<>();

    public void setMenegements(int temp, int presser) {
        this.temp = temp;
        this.presser = presser;
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.handleEvent(temp, presser);
        }
    }
}