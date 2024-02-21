// Link : https://leetcode.com/problems/running-sum-of-1d-array/description/
// Discription : Running Sum of 1d Array

import java.util.Arrays;

public class ContinousSum {
    static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i-1];
        return nums;
    }
    public static void main(String[] args) {
        int[] a = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(a)));
    }
}
