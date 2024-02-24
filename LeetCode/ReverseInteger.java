// Link : https://leetcode.com/problems/reverse-integer/description/
// description : Reverse Integer

public class ReverseInteger {
    static int reverse(int x) {
        long n = 0;
        while(x!=0){
            int r = x % 10;
            n = n * 10 + r;
            x /= 10;
            if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE)
                return 0;
        }
        return (int)n;
    }

    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println(reverse(n));
    }
}
