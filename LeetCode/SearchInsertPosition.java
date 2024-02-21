// Link : https://leetcode.com/problems/search-insert-position/
// Discription : Search Insert Position

public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(searchInsert(a, 5));
    }
}