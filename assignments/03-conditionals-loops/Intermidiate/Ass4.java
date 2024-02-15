import java.util.*;
public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the MRP : ");
        double mrp = sc.nextDouble();
        System.out.print("Enter the Discount percent : ");
        double dis = sc.nextDouble();
        System.out.println("Discount : "+(dis/100*mrp));
        System.out.println("Amount : "+(mrp-dis/100*mrp));
        sc.close();
    }
}
