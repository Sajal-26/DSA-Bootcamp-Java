// Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Discription : Peak Index in a Mountain Array

public class Bitonic {

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid+1] < arr[mid])
                end = mid;
            else
                start = mid+1;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
