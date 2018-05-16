package patternsP.strategy.context;

import patternsP.strategy.strategy.Strategy;

public class StrategyClient {
    Strategy stretegy;
    public void setStretegy(Strategy stretegy) {
        this.stretegy = stretegy;
    }
    public void executeStrategy(int arr[]) {
        stretegy.sort(arr);
    }
}