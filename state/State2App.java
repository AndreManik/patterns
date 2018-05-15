package patternsP.state;

import patternsP.state.context.Human;
import patternsP.state.state.Work;

public class State2App {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());

        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}







