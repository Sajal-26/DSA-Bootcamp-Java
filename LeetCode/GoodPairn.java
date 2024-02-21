// Link : https://leetcode.com/problems/number-of-good-pairs/description/
// Description : Number of Good Pairs

public class GoodPairn {
    static int numIdenticalPairs(int[] nums) {
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(a));
    }
}
