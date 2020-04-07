package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/equality-in-a-array/problem
 */
public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int value : arr) {
            if (hashMap.containsKey(value)) {
                hashMap.put(value, hashMap.get(value) + 1);
            } else {
                hashMap.put(value, 1);
            }
        }
         int max = Collections.max(hashMap.values());
        return arr.length - max;
    }

    public static void main(String[] args) {
        int t, size;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();
            int []arr = new int[size];

            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(equalizeArray(arr));
        }
    }
}
