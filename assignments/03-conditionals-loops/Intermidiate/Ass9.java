import java.util.*;
public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of balls : ");
        double balls = sc.nextDouble();
        System.out.print("Enter number of hits : ");
        double hits = sc.nextDouble();
        System.out.println("Batting Average : "+(hits/balls));
        sc.close();
    }
}
