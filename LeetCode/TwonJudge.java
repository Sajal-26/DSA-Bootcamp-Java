// Link: https://leetcode.com/problems/find-the-town-judge/description/?envType=daily-question&envId=2024-02-22
// Description : Find the Town Judge

public class TwonJudge {
    static int findJudge(int n, int[][] trust) {
        int trusted[] = new int[n + 1];
        for(int i = 0; i < trust.length; i++)
            trusted[trust[i][1]]++;

        int answer = 0;

        for(int i = 1; i <= n; i++)
            if(trusted[i] == n - 1)
                answer = i;

        for(int i = 0; i < trust.length; i++)
            if(trust[i][0] == answer)
                return -1;

        return answer == 0 ? -1 : answer;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        System.out.println(findJudge(3, trust));
    }
}
