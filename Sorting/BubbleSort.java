package Sorting;
import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;    // swapped variable enhances the performance
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,8,20,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
