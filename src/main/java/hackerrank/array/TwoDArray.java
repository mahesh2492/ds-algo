package hackerrank.array;

/*
https://www.hackerrank.com/challenges/2d-array/problem
 */
public class TwoDArray {

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int mid = arr[i + 1][j + 1];
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                sum = top + mid + bottom;
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(hourglassSum(a));
    }
}
