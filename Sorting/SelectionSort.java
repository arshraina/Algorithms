package Sorting;

import java.util.Arrays;

public class SelectionSort {
    // Less memory writes
    // theta(n^2)
    // Basic idea for heap sort
    // Not stable because it swaps order of same values
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_ind = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,20,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
