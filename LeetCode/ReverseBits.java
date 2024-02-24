// Link : https://leetcode.com/problems/reverse-bits/description/
// Description : Reverse Bits

public class ReverseBits {
    static int reverseBits(int n) {
        int r = 0;
        for(int i = 0; i < 32; i++){
            r <<= 1;
            if((n & 1) == 1)
                r |= 1;
            n >>= 1;
        }
        return r;
    }
    public static void main(String[] args) {
        int n = 1011;
        System.out.println(reverseBits(n));
    }
}
