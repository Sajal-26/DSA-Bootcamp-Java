import java.util.*;
public class Ass10 {
    static boolean palindrom(int n){
        int m=n, s=0;
        while (m!=0) {
            s=s*10+(m%10);
            m/=10;            
        }
        return n==s;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        System.out.println(palindrom(new Scanner(System.in).nextInt())?"Palindrom":"Not Palindrom");
    }
}
