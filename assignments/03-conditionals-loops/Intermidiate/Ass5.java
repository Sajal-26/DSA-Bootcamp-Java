import java.util.*;
public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cordinates of the 1st point : ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter the cordinates of the 2nd point : ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Distance : "+(Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2))));
        sc.close();
    }
}
