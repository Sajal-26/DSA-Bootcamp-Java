import java.util.*;
public class Ass7 {
    static  boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        System.out.println(prime(new Scanner(System.in).nextInt())?"Prime":"Not Prime");
    }
}
