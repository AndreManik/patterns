package patternsP.observer.podpischik;

public class ConcreteObserver implements Observer {
    public void handleEvent(int temp, int presser) {
        System.out.println("Temperature: "+ temp + " Pressure: " + presser);
    }
}