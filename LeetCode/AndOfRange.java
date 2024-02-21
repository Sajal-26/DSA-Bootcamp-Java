// Link : https://leetcode.com/problems/bitwise-and-of-numbers-range/description/
// Discription : Bitwise AND of Numbers Range

class AndOfRange{

    static int rangeBitwiseAnd(int left, int right) {
        int and = 0;
        while(left<right){
            left >>= 1;
            right >>= 1;
            and++;
        }
        return left << and;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }
}