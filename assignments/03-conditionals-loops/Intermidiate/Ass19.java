import java.util.*;
public class Ass19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt();
        while (b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.print("HCF : "+a);
        sc.close();
    }
}
