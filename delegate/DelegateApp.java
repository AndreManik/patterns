package patternsP.delegate;

import patternsP.delegate.model.Cocktail;
import patternsP.delegate.model.Salad;
import patternsP.delegate.model.Soup;
import patternsP.delegate.model.Waiter;

public class DelegateApp {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.setCooked(new Cocktail());
        waiter.takeOrder();

        waiter.setCooked(new Salad());
        waiter.takeOrder();

        waiter.setCooked(new Soup());
        waiter.takeOrder();
    }
}

