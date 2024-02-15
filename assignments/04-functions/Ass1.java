import java.util.*;
public class Ass1 {
    static int max(int a, int b){
        return a>b?a:b;
    }
    static int min(int a, int b){
        return a>b?b:a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Max : "+max(a, b));
        System.out.println("Min : "+min(a, b));
        sc.close();
    }
}
