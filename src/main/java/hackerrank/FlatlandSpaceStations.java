package hackerrank;

import sun.security.provider.certpath.CertId;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;

/*
https://www.hackerrank.com/challenges/flatland-space-stations/problem
 */
public class FlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int[] cities) {
        int distance = 0;

        for (int i = 0; i < n; i++){
            int temp = Math.abs(i - cities[0]);
            for (int city : cities) {
                temp = Math.min(temp, Math.abs(i - city));
            }
            distance = Math.max(distance, temp);
        }
        return distance;
    }

    public static void main(String[] args) {
        int t, noOfCity, noOfSpaceStations;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
          noOfCity = sc.nextInt();
            noOfSpaceStations = sc.nextInt();
          int []spaceStations = new int[noOfSpaceStations];

          for(int i = 0; i < noOfSpaceStations; i++) {
              spaceStations[i] = sc.nextInt();
          }

          System.out.println(flatlandSpaceStations(noOfCity, spaceStations));
        }
    }
}
