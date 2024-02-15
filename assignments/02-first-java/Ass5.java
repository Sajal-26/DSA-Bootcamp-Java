import java.util.*;
public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a>b?a:b);
        sc.close();
    }
}
