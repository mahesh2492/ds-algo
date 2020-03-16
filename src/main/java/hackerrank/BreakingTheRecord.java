package hackerrank;

/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecord {
    static int[] breakingRecords(int[] scores) {
        int max = 0, min = 0;
        int maxRecord = scores[0], minRecord = scores[0];

        for(int s : scores) {
          if(s > maxRecord) {
             maxRecord = s;
              max++;
          } else if(s < minRecord) {
              minRecord = s;
              min++;
          }
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] ints = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};

        int []result = breakingRecords(ints);

        for(int r: result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}
