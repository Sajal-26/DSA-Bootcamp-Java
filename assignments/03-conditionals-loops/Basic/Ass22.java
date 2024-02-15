import java.util.*;
public class Ass22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int s=0, p=1;
        while (n!=0) {
            s+=n%10;
            p*=n%10;
            n/=10;
        }
        System.out.println(p-s);
        sc.close();
    }
}
