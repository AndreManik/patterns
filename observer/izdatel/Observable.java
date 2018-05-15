package patternsP.observer.izdatel;

import patternsP.observer.podpischik.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
