// Link : https://leetcode.com/problems/missing-number/description/?envType=daily-question&envId=2024-02-20
// Discription : Missing Number

public class MissingNumber {
    static int missingNumber(int[] nums) {
        int n = nums.length, totalsum = n*(n+1)/2, sum = 0;
        for(int i:nums)
            sum += i;
        return totalsum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
