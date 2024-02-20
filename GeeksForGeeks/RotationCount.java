// Link : https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
// Discription : Find the Rotation Count in Rotated Sorted array

public class RotationCount {

    static int rotationcount(int[] arr){
        if(arr[0] < arr[arr.length-1])
            return 0;
        return pivot(arr) + 1;
    }

    static int pivot(int[] arr){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid-1] > arr[mid])
                return mid-1;
            if(arr[start] > arr[mid])
                end = mid-1;
            else 
                start = mid+1;
        } 
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotationcount(arr));
    }
}
