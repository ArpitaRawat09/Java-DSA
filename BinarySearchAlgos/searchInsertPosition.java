package BinarySearchAlgos;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8};
        int target = 9;
        int f=0 , l=arr.length-1;
        while(f<=l){
            int mid = (f+l)/2;
            if(arr[mid] == target){
                System.out.println("Target found at index: " + mid);
                return ;
            }
            else if(arr[mid]<target) f=mid+1;
            else l=mid-1;
        }

    System.out.println("target element should be inserted at Index is :" + f);
    }
}