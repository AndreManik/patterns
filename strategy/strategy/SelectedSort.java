package patternsP.strategy.strategy;

import patternsP.strategy.strategy.Strategy;

import java.util.Arrays;

public class SelectedSort implements Strategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Selected sort");
        System.out.println("Before: " + Arrays.toString(arr));

        int index;

        for (int i = 0; i < arr.length; i++) {
            index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            swap(arr, i, index);
        }
        System.out.println("After: " + Arrays.toString(arr));
    }

    private void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}