// Link : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
// Discription : Find First Palindromic String in the Array

public class FirstPalindrom {
    static boolean isPalindrom(String str){
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        return true;
    }

    static String firstPalindrome(String[] words) {
        for(String str : words)
            if(isPalindrom(str))
                return str;
        return "";
    }

    public static void main(String[] args) {
        String[] wrds = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(wrds));
    }

}
