import java.util.*;
public class Ass14 {
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
        System.out.print("Enter a number : ");
        System.out.println(isArmstrong(sc.nextInt())?"Armstrong":"Not Armstrong");
        sc.close();
    }
}
