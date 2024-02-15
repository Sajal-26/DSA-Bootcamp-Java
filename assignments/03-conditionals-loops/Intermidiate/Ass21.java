import java.util.*;
public class Ass21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char s=sc.next().charAt(0);
        String str = ""+s;
        System.out.println((str.equalsIgnoreCase("a") ||
                            str.equalsIgnoreCase("e") ||
                            str.equalsIgnoreCase("i") ||
                            str.equalsIgnoreCase("o") ||
                            str.equalsIgnoreCase("u"))?"Vowel":"Constant");
        sc.close();
    }
}
