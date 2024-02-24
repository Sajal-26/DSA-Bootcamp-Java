// Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
// Description : Check if the Sentence Is Pangram

public class Pangram {

    static boolean checkIfPangram(String sentence) {
        char ch = 'a';
        for(int i =0;i<26;i++){
            if(!sentence.contains(String.valueOf(ch)))
                return false;
            ch++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
}