import java.util.*;
public class Ass14 {
    static int sumN(int n){
        return n*(n+1)/2;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter nth number : ");
        System.out.println("Sum : "+sumN(new Scanner(System.in).nextInt()));
    }
}
