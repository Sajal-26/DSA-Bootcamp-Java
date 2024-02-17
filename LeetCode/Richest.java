// Link : https://leetcode.com/problems/richest-customer-wealth/description/
// Discription : Richest Customer Wealth

package LeetCode;

public class Richest {
    static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int[] i:accounts){
            int s = 0;
            for(int j:i)
                s+=j;
            if(s>richest)
                richest = s;
        }
        return richest;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
}
