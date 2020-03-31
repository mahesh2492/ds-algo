package hackerrank;

import java.util.Scanner;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
     int []result = new int[p.length];
        for (int value : p) {
            result[p[p[value - 1] - 1] - 1] = value;
        }

      return result;
    }

    public static void main(String[] args) {
         int t, sizeOFArray;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            sizeOFArray = sc.nextInt();
            int []arr = new int[sizeOFArray];

           for(int i = 0; i < sizeOFArray; i++) {
               arr[i] = sc.nextInt();
           }

            for(int p: permutationEquation(arr)){
                System.out.println(p);
            }

        }
    }
}
