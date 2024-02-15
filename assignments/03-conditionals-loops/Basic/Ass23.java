import java.util.*;
public class Ass23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(n%i==0?i+", ":"");
        sc.close();
    }
}
