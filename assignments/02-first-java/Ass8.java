import java.util.*;
public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        boolean flag = true;
        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                flag = false;
                break;
            }
        System.out.println(flag?"Palindrom":"Not Palindrom");
        sc.close();
    }
}
