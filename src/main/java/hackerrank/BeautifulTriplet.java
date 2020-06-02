package hackerrank;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/beautiful-triplets/problem
 */
public class BeautifulTriplet {

    static int beautifulTriplets(int d, int[] arr) {
        int triplets = 0;

        for(int i = 0; i < arr.length ; i++) {
            int previous = i, count = 0;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] - arr[previous] == d) {
                    previous = j;
                    count++;
                  }

                if(count == 2) {
                    triplets++;
                    break;
                }
              }
          }

        return triplets;
    }

    public static void main(String[] args) {
       int t, d, size;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();
            d = sc.nextInt();
            int []arr = new int[size];

            for(int i = 0; i < size ; i++ ) {
               arr[i] = sc.nextInt();
            }

            System.out.println(beautifulTriplets(d, arr));
        }
    }
}
