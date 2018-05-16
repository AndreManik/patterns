package patternsP.strategy;

import patternsP.strategy.context.StrategyClient;
import patternsP.strategy.strategy.BubbleSort;
import patternsP.strategy.strategy.InsertSort;
import patternsP.strategy.strategy.SelectedSort;
import patternsP.strategy.strategy.Strategy;

import java.util.Random;

public class StrategyApp {
    public static void main(String[] args) {
        Strategy strategy = new InsertSort();
        StrategyClient client = new StrategyClient();
        client.setStretegy(strategy);

        int[] arr = new int[15];
        mock(arr);
        client.executeStrategy(arr);
        mock(arr);
        client.setStretegy(new BubbleSort());
        client.executeStrategy(arr);
        mock(arr);
        client.setStretegy(new SelectedSort());
        client.executeStrategy(arr);
    }

    private static void mock(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
}



