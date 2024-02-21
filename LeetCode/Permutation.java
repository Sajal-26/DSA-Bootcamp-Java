// Link : https://leetcode.com/problems/build-array-from-permutation/description/
// Discription : Build Array from Permutation

import java.util.Arrays;

public class Permutation {
    static int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            temp[i] = nums[nums[i]];
        return temp;
    }
    public static void main(String[] args) {
        int[] a = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(a)));
    }   
}
