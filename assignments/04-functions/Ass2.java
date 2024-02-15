import java.util.*;
public class Ass2 {
    static boolean type(int n){
        return n%2==0;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        System.out.print(type(new Scanner(System.in).nextInt())?"Even":"Odd");
    }
}
