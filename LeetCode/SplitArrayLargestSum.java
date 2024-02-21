// Link : https://leetcode.com/problems/split-array-largest-sum/description/
// Discription : Split Array Largest Sum

public class SplitArrayLargestSum{

    static int splitArray(int[] nums, int k) {
        int  start = 0, end = 0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end - start) / 2, sum = 0, p = 1;
                for(int i : nums){
                    if(sum + i > mid){
                        sum = i;
                        p++;
                    } else
                        sum += i;
                }

            if(p <= k)
                end = mid;
            else
                start = mid + 1;
        }

        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(splitArray(arr, 2));
    }
}
