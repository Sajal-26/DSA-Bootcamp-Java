import java.util.*;
public class Ass24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(), s=0;
        while (n!=0) {
            s+=n%10;
            n/=10;
        }
        System.out.println("Sum : "+s);
        sc.close();
    }
}
