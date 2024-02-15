import java.util.*;
public class Ass23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        System.out.println(sc.nextInt()%4==0?"Leap Year":"Not a leap year");
        sc.close();
    }
}
