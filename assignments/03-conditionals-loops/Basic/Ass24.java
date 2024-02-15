import java.util.*;
public class Ass24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        System.out.println("Enter numbers : ");
        while(true) {
            int n = sc.nextInt();
            if(n==0)
                break;
            s+=n;
        }
        System.out.println("Sum : "+s);
        sc.close();
    }
}
