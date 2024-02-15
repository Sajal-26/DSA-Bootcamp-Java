import java.util.*;
public class Ass3 {
    static boolean elig(int age){
        return age>=18;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter Age : ");
        System.out.println(elig(new Scanner(System.in).nextInt())?"Eligible":"Not eligible");
    }
}
