import java.util.*;
public class Ass26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        int sn=0, spe=0, spo=0;
        while (true) {
            int n=sc.nextInt();
            if(n==0)
                break;
            if(n<0)
                sn+=n;
            else if(n>0 && n%2==0)
                spe+=n;
            else
                spo+=n;
        }
        System.out.println("Negative : "+sn);
        System.out.println("Positive Even : "+spe);
        System.out.println("positive Odd : "+spo);
        sc.close();
    }
}
