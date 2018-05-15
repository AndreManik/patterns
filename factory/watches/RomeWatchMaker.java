package patternsP.factory.watches;

import patternsP.factory.maker.RomeWatch;
import patternsP.factory.maker.WatchMaker;

public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}