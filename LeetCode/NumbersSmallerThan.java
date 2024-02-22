// Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
// Description : How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class NumbersSmallerThan {
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int max = -1;
        for(int i : nums)
            max = Math.max(max, i);
        int[] numbers = new int[max+1];
        for(int i : nums)
            numbers[i]++;
        for(int i = 1; i <= max; i++)
            numbers[i] += numbers[i-1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = numbers[nums[i] - 1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
