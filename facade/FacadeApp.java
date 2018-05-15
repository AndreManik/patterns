package patternsP.facade;

import patternsP.facade.model.Computer;

public class FacadeApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
        computer.close();
    }
}







