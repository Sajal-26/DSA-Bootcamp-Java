import java.util.*;
public class Ass25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter the month number : ");
        int n = sc.nextInt();
        try{
            System.out.println("Days : "+days[n-1]/2);
        } catch(Exception e){
            System.out.println("Wrong Input!");
        }
        sc.close();
    }
}
