// Link : https://leetcode.com/problems/palindrome-number/description/
// Discription : Palindrome Number

public class Palindrom {
    static boolean isPalindrome(int x) {
        int s = 0;
        int y = x;
        while(y > 0) {
            s = s * 10 + y % 10;
            y /= 10;
        }
        return s == x;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
