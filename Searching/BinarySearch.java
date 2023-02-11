package Searching;

public class BinarySearch {
    //Binary search for sorted array
    static int bSearch(int[] a, int x){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(a[mid] == x){
                return mid;
            }
            else if(a[mid] < x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] a = new int[5];
        int [] a = {1,2,3,4,5};
        System.out.println(bSearch(a, 4));
    }
}
