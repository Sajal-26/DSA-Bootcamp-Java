import java.util.*;
public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        System.out.println(sc.nextInt()%2==0?"Even":"Odd");
        sc.close();
    }
}
