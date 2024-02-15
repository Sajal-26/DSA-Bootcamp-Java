import java.util.*;
public class Ass20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt(), a1=a, b1=b;
        while (b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.println("LCM : "+((a1*b1)/a));
        sc.close();
    }
}
