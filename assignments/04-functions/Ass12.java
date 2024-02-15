import java.util.*;
public class Ass12 {
    static boolean pythogorous(int a, int b, int c){
        return ((a*a)+(b*b))==(c*c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(pythogorous(a, b, c));
        sc.close();
    }
}
