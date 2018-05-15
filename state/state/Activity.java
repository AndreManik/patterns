package patternsP.state.state;

import patternsP.state.context.Human;

//state
public interface Activity {
    void doSomething(Human context);
}
