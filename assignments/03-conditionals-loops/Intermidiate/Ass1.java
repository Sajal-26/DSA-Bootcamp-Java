import java.util.*;
public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i=1;
        while (n!=1) 
            i*=n--;
        System.out.println("Factorial : "+i);
        sc.close();
    }
}
