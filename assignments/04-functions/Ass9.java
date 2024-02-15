import java.util.*;
public class Ass9 {
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n*factorial(n-1);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        System.out.println("Factorial : "+factorial(new Scanner(System.in).nextInt()));
    }
}
