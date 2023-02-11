package Sorting;
import java.sql.SQLOutput;
import java.util.*;

public class QuickSort {

    public static void main (String[] args)
    {
        int arr1[] = new int[]{8,4,7,9,3,10,5};
        int arr2[] = new int[]{3,5,2,6,8,9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        System.out.println("Original Array1:");
        System.out.println(Arrays.toString(arr1));
        qSortLomuto(arr1,0,n1-1);
        System.out.println("Sorted Array1(Lomuto Partition):");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Original Array2:");
        System.out.println(Arrays.toString(arr2));
        qSortHoare(arr2,0,n2-1);
        System.out.println("Sorted Array2(Hoare's Partition):");
        System.out.println(Arrays.toString(arr2));
    }

    static int lomutoPartition(int arr[], int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static int hoarePartition(int arr[], int l, int h)
    {
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    static void qSortLomuto(int arr[], int l, int h){
        //lomuto
        if(l<h){
            int p= lomutoPartition(arr,l,h);
            qSortLomuto(arr,l,p-1);
            qSortLomuto(arr,p+1,h);
        }

    }

    static void qSortHoare(int arr[], int l, int h){
        //hoare
        if(l<h){
            int p= hoarePartition(arr,l,h);
            qSortHoare(arr,l,p);
            qSortHoare(arr,p+1,h);
        }
    }

}





