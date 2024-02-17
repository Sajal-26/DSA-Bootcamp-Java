// Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// Description : Find First and Last Position of Element in Sorted Array

import java.util.Arrays;
public class FirstLast {
    static int search(int[] nums, int target, boolean starting){
        int start = 0, end = nums.length-1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans = mid;
                if(starting)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;   
    }

    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(a, 8)));
    }

}
