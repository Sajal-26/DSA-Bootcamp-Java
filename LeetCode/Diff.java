// Link : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

// Discription : Subtract the Product and Sum of Digits of an Integer

public class Diff {
    static int subtractProductAndSum(int n) {
        int s=0, p=1;
        while(n!=0){
            int r = n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        return p-s;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
