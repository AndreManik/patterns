package patternsP.state.state;

import patternsP.state.context.Human;

public class WeekEnd implements Activity {
    private int count = 0;
    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Relax");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
