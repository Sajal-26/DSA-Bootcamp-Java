import java.util.*;
public class Ass5 {
    static int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        System.out.println("Product : "+product(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
