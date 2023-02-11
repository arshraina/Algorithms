package Sorting;

import java.util.Arrays;

public class InsertionSort {
    // theta(n^2)
    // stable
    // used in practice for small arrays(TimSort & IntroSort)
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   //key is initially part of unsorted portion
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,20,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
