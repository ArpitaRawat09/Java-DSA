package BinarySearchAlgos;

public class peakIndexMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,15,4,2,1};
        int f = 0,l=arr.length-1 ;
        while(f < l){
            int mid = (f+l)/2;
            if(arr[mid] <= arr[mid+1]){
                f = mid+1;
            }else{
                l=mid;
            }
        }
        System.out.println("Peak Element is : " + f);
    }
}
