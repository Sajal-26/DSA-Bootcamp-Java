import java.util.*;
public class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the P, R and T : ");
        System.out.println("Interest : " + (sc.nextInt()*sc.nextInt()*sc.nextInt())/100);
        sc.close();
    }
}
