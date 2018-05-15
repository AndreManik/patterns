package patternsP.factory;

import patternsP.factory.maker.DigitalWatchMaker;
import patternsP.factory.maker.WatchMaker;
import patternsP.factory.watches.RomeWatchMaker;
import patternsP.factory.watches.Watch;

public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Rome");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        switch (maker) {
            case "Digital":
                return new DigitalWatchMaker();
            case "Rome":
                return new RomeWatchMaker();
                default:
                    throw new RuntimeException("Unsupported watch line " + maker);
        }
    }
}











