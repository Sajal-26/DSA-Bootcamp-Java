import java.util.*;
public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the MRP : ");
        double mrp = sc.nextDouble();
        System.out.print("Enter the Selling Price : ");
        double sp = sc.nextDouble();
        System.out.println("Depreciation : "+(mrp-sp));
        sc.close();
    }
}
