import java.util.*;
public class Ass22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(), s=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                s+=i;
        System.out.println(s==n?"Perfect Number":"Not a perfect number");
        sc.close();
    }
}
