import java.util.*;
public class Ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt(), s=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter Marks for subject"+(i+1)+" : ");
            s+=sc.nextInt();
        }
        System.out.printf("Average = %.2f",(double)(s/n));
        sc.close();
    }
}
