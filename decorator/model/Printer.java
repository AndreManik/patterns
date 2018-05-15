package patternsP.decorator.model;

public class Printer implements PrinterInterface {
    String value;
    public Printer(String value) {
        this.value = value;
    }
    public void print() {
        System.out.print(value);
    }
}