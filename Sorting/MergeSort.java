package Sorting;

import java.util.Arrays;

public class MergeSort {
    // Divide and Conquer Algorithm
    // Stable Algorithm
    // Time: theta(nlogn)       Aux Space: theta(n)
    // Suited for Linked Lists Aux Space: theta(1)
    // In case of arrays QuickSort is better
    public static void main (String[] args)
    {
        int a[] = {10,5,30,15,7};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(a));
        int l=0,r=a.length-1;
        mergeSort(a,l,r);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(a));
    }

    static void merge(int arr[], int l, int m, int h){

        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
    }

    static void mergeSort(int arr[],int l,int r){
        if(r>l){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

}
