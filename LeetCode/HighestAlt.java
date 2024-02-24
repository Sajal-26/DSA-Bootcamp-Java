// Link : https://leetcode.com/problems/find-the-highest-altitude/description/
// Description : Find the Highest Altitude

public class HighestAlt {
    static int largestAltitude(int[] gain) {
        int maxalt = 0, prsntalt = 0;
        for(int i : gain){
            prsntalt += i;
            maxalt = Math.max(maxalt, prsntalt);
        }
        return maxalt;
    }
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}
