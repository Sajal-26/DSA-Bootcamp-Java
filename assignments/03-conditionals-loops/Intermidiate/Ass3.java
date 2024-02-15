import java.util.*;
public class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt(), s=0;
        System.out.print("Enter Values : ");
        for(int i=0;i<n;i++)
            s+=sc.nextInt();
        System.out.println("Average : "+s/n);
        sc.close();
    }   
}
