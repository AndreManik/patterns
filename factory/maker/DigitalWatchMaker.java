package patternsP.factory.maker;

import patternsP.factory.watches.DigitalWatch;
import patternsP.factory.watches.Watch;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}