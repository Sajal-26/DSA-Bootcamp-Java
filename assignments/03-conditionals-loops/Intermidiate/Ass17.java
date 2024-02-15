import java.util.*;
public class Ass17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt(), m=n, s=0;
        while (m!=0){
            s=(s*10)+(m%10);
            m/=10;
        }
        System.out.println(s==n?"Palindrom":"Not Palindrom");
        sc.close();
    }
}
