import java.util.*;
public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the expression :");
        char e = sc.next().charAt(0);
        if(e=='+')
            System.out.println("Sum : "+(a+b));
        else if(e=='-')
            System.out.println("Sum : "+(a-b));
        else if(e=='*')
            System.out.println("Sum : "+(a*b));
        else if(e=='/')
            System.out.println("Sum : "+(a/b));
        else
            System.out.println("Wrong Choice");
        sc.close();
    }
}
