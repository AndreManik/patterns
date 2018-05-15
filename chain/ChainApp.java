package patternsP.chain;

import patternsP.chain.logger.*;

public class ChainApp {
    public static void main(String[] args) {
        Logger logger = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);
        logger.setNext(logger1);
        logger1.setNext(logger2);
        logger.writeMessage("info", Level.INFO);
        logger.writeMessage("debug", Level.DEBUG);
        logger.writeMessage("error", Level.ERROR);
    }
}