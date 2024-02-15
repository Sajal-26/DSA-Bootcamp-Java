import java.util.*;
public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units : ");
        int n = sc.nextInt();
        System.out.print("Enter rate per units : ");
        System.out.println("Bill : "+n*sc.nextInt());
        sc.close();
    }
}
