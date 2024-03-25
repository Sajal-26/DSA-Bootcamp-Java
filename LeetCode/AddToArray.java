// Description : . Add to Array-Form of Integer
// Link : https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        for(int i : num){
            System.out.println(i);
            sum = sum * 10 + i;
            System.out.println(sum);
        }
        sum += k;
        List<Integer> ans = new ArrayList<>();
        String str = String.valueOf(sum);
        for(int i = 0; i < str.length(); i++)
            ans.add(Character.getNumericValue(str.charAt(i)));
        return ans;
    }
    public static void main(String[] args) {
        int[] l = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(l, 1));
    }
}
