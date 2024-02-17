import java.util.*;
public class Ass13 {
    static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  range : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
            System.out.print(isprime(i)?i+", ":"");
        sc.close();
    }
}