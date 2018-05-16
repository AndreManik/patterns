package patternsP.strategy.strategy;

import patternsP.strategy.strategy.Strategy;

import java.util.Arrays;

public class BubbleSort implements Strategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sort");
        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j);
                }
            }
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
    private void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}