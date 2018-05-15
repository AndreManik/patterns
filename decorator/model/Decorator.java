package patternsP.decorator.model;

public abstract class Decorator implements PrinterInterface {

    private PrinterInterface component;
    Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
