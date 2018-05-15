package patternsP.state.state;

import patternsP.state.context.Human;

public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Worked!!!");
        context.setState(new WeekEnd());
    }
}
