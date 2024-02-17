// Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// Discription : Find Numbers with Even Number of Digits

public class EvenNumber {
    public static int findNumbers(int[] nums) {
        int c = 0;
        for(int i:nums)
            if(((int)(Math.log10(i)+1) & 1) == 0)
                c++;
        return c;
    }

    public static void main(String[] args) {
        int[] a = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(a));
    }
}
