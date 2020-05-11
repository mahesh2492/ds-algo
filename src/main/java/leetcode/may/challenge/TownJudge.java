package leetcode.may.challenge;

//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/
public class TownJudge {
    public static int findJudge(int N, int[][] trust) {
        int i;
        int [][]trustStats = new int[N + 1][N + 1];

        for(i = 0; i < trust.length; i++) {
            int first = trust[i][0];
            int second = trust[i][1];

            trustStats[first][0] += 1;
            trustStats[second][1] += 1;
        }

        for(i = 1; i < trustStats.length; i++) {
            if(trustStats[i][0] == 0 && trustStats[i][1] == N - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
       int [][] arr = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println(findJudge(3, arr));
    }
}
