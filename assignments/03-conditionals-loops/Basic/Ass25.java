import java.util.*;
public class Ass25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        int max = 0;
        while (true) {
            int n = sc.nextInt();
            if(n==0)
                break;
            max = n>max?n:max;
        }
        System.out.println(max);
        sc.close();
    }
}
