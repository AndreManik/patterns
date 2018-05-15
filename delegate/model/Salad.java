package patternsP.delegate.model;

import patternsP.delegate.model.Cooked;

public class Salad implements Cooked {
    @Override
    public void cook() {
        System.out.println("Created salad");
    }
}
