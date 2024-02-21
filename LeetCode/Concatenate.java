// Link : https://leetcode.com/problems/concatenation-of-array/description/
// Discription : Concatenation of Array

import java.util.Arrays;

public class Concatenate {

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(a)));
    }
}
