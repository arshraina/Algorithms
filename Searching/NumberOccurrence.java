package Searching;

public class NumberOccurrence {
    static int firstOcc(int[] a, int x){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(a[mid] > x){
                high = mid-1;            }
            else if(a[mid] < x){
                low = mid+1;
            }
            else{
                if(mid == 0 || a[mid] != a[mid-1]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    static int lastOcc(int[] a, int x){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(a[mid] > x){
                high = mid-1;            }
            else if(a[mid] < x){
                low = mid+1;
            }
            else{
                if(mid == a.length-1 || a[mid] != a[mid+1]){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    static int numOcc(int[] a, int x){
        int first = firstOcc(a,x);
        if (first == -1) {
            return 0;
        }
        else {
            return lastOcc(a,x)-first+1;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        System.out.println(numOcc(a,1));
    }
}
