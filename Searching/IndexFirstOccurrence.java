package Searching;

public class IndexFirstOccurrence {
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

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        System.out.println(firstOcc(a,1));
    }
}
