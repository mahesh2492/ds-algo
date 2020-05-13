package hackerrank;

import java.util.*;
/*
https://www.hackerrank.com/challenges/luck-balance/problem
 */
public class LuckChance {

    static int luckBalance(int k, int[][] contests) {
        int luck = 0;
        List<Integer> list = new ArrayList<>();

        for (int[] contest : contests) {
            if (contest[1] == 1) {
                list.add(contest[0]);
            } else {
                luck += contest[0];
            }
        }

        for(int i = 0; i < k; i++) {
           if(list.isEmpty()) {
               break;
           }
            int max = Collections.max(list);
            luck += max;
            list.remove((Integer) max);
        }

        for(int l: list) {
            luck -= l;
        }

        return luck;
    }

    public static void main(String[] args) {
       int t, k, size;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();
            k = sc.nextInt();

            int [][] contests = new int[size][2];
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < 2; j++) {
                    contests[i][j] = sc.nextInt();
                }
            }

            System.out.println(luckBalance(k, contests));
        }
    }
}
