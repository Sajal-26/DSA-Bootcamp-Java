import java.util.*;
public class Ass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and power : ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int pr=1;
        for(int i=0;i<p;i++)
            pr*=n;
        System.out.println("Result : "+pr);
        sc.close();
    }
}
