package leetcode.may.challenge;

import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/
 */
public class CheckStraightLine {

    private static float slope(int []p1, int []p2) {
      if(p1[0] - p2[0] == 0) return 0;

      return (float)(p2[1] - p1[1])/(p2[0] - p1[0]);
    }

    public static boolean checkStraightLine(int[][] coordinates) {
       int []point1 = coordinates[1];
       int []point2 = coordinates[0];
       float gSlope = slope(point1, point2);

        for(int i = 1; i < coordinates.length - 1; i++) {
           int []p1 = coordinates[i];
           int []p2 = coordinates[0];
           float slope = slope(p1, p2);
           if(gSlope != slope) return false;
       }

        return true;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int row, column = 2;
        while (t-- > 0) {
            row = sc.nextInt();
            int [][]coordinates = new int[row][column];

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < column; j ++) {
                    coordinates[i][j] = sc.nextInt();
                }
            }

            System.out.println("is a straight line? " + checkStraightLine(coordinates));
        }
    }
}
