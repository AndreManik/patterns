package patternsP.delegate.model;

public class Cocktail implements Cooked {
    @Override
    public void cook() {
        System.out.println("Create cocktail");
    }
}
