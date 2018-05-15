package patternsP.delegate.model;

import patternsP.delegate.model.Cooked;

public class Waiter {
    private Cooked cooked;

    public void setCooked(Cooked cooked) { //мутатор
        this.cooked = cooked;
    }
    public void takeOrder() {
        cooked.cook();
    }
}
