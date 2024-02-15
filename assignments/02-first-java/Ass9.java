import java.util.*;

public class Ass9 {
    static int digits(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    static boolean isArmstrong(int n){
        int s = 0, m = n;
        while(m!=0){
            s+=Math.pow(m%10, digits(n));
            m/=10;
        }
        return s==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=a; i<=b; i++)
            System.out.print(isArmstrong(i)?i+" ":"");
        sc.close();
    }
}
