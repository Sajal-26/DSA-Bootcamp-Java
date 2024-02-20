// Link : https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2024-02-19
// Discription : Power Of Two

class PowerOfTwo{
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}