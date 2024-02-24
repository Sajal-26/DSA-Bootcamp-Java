// Link : https://leetcode.com/problems/two-sum/description/
// Description : Two Sum

import java.util.Arrays;

public class Twosum {
    static int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++)
            for(int j=i;j<nums.length;j++)
                if(nums[j-i]+nums[j]==target)
                    return new int[]{j-i, j};
      return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
