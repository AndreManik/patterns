package patternsP.delegate.model;

import patternsP.delegate.model.Cooked;

public class Soup implements Cooked {
    @Override
    public void cook() {
        System.out.println("Create Soup");
    }
}
