package patternsP.factory.maker;

import patternsP.factory.watches.Watch;

public class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("XV");
    }
}