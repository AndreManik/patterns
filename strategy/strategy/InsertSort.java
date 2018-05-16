package patternsP.strategy.strategy;

import patternsP.strategy.strategy.Strategy;

import java.util.Arrays;

public class InsertSort implements Strategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("InsertSort");
        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];
            int in = i;

            while (in > 0 && arr[in-1] > temp) {
                arr[in] = arr[in-1];
                --in;
            }
            arr[in] = temp;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
}