package patternsP.state.context;

import patternsP.state.state.Activity;

//context
public class Human {
    private Activity state;
    public void setState (Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
