import java.util.*;
public class Ass6 {
    static double circumference(int r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        System.out.println("Circumference : "+circumference(sc.nextInt()));
        sc.close();
    }
}
