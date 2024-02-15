import java.util.*;
public class Ass15 {
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        int f=1;
        while(n>0)
            f*=n--;
        return f;
    }
    static int combination(int n, int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    static int permutation(int n, int r){
        return fact(n)/fact(n-r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Combination\r\n" //
                        +"2. Permutation\r\n" //
                        +"Enter : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter the number of items : ");
                int n = sc.nextInt();
                System.out.print("Enter the number of combos : ");
                int r = sc.nextInt();
                System.out.println("Combinations : "+combination(n, r));
                break;
            case 2:
                System.out.print("Enter the number of items : ");
                int n1 = sc.nextInt();
                System.out.print("Enter the number of combos : ");
                int r1 = sc.nextInt();
                System.out.println("Combinations : "+permutation(n1, r1));
                break;
            default:
                System.out.println("Wrong Choice!");
        }
        sc.close();
    }
}
