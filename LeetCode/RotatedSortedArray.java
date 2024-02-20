// Link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// Discription : Search in Rotated Sorted Array

public class RotatedSortedArray {
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot == -1)
            return binary(nums, target, 0, nums.length-1);
        if(nums[pivot] == target)
            return pivot;
        if(target >= nums[0])
            return binary(nums, target, 0, pivot-1);
        return binary(nums, target, pivot+1, nums.length-1);
    }

    static int findpivot(int[] arr){
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[mid] < arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    static int binary(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,9,0,0,1,1,1,1};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
