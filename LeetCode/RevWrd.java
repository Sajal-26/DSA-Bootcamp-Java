// Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/description/?envType=daily-question&envId=2024-02-25
// Description : Reverse Words in a String III

class RevWrd{
    static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                word.append(s.charAt(i));
            else {
                sentence.append(reverse(word.toString())).append(" ");
                word.setLength(0);
            }
        }
        sentence.append(reverse(word.toString()));
        return sentence.toString();
    }

    static String reverse(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            rev.append(s.charAt(i));
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
}