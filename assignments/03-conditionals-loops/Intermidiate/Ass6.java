import java.util.*;
public class Ass6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the SP : ");
        double price = sc.nextDouble();
        System.out.print("Enter the Commission : ");
        double comm = sc.nextDouble();
        System.out.println("Commission % : "+(comm/price*100)+"%");
        sc.close();
    }
}
