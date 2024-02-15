import java.util.*;
public class Ass8 {
    static String grade(int n){
        if(90<n && n<=100)
            return "AA";
        if(80<n && n<=90)
            return "AB";
        if(70<n && n<=80)
            return "BB";
        if(60<n && n<=70)
            return "BC";
        if(50<n && n<=60)
            return "CD";
        if(40<n && n<=50)
            return "DD";
        return "FAIL";
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter your marks : ");
        System.out.println("Grade : "+grade(new Scanner(System.in).nextInt()));
    }
}
