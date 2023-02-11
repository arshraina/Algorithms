package Searching;

public class IndexLastOccurrence {
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

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        System.out.println(lastOcc(a,1));
    }
}
