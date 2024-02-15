import java.util.*;
public class Ass4 {
    static int sum(int a, int b){
        return a+b;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        System.out.println("Sum : "+sum(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
    }
}
