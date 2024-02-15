import java.util.*;
public class Ass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine(), sr="";
        for(int i=0;i<st.length();i++)
            sr+=st.charAt(st.length()-1-i);
        System.out.println("Reversed : "+sr);
        sc.close();
    }
}
