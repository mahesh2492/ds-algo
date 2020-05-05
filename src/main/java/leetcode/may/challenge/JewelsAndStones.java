package leetcode.may.challenge;

import java.util.HashMap;
import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> stones = new HashMap<>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(stones.containsKey(c)) {
                stones.put(c, stones.get(c) + 1);
            } else {
                stones.put(c, 1);
            }
        }

        int count = 0;
        for(int i = 0; i < J.length(); i++) {
            count += stones.getOrDefault(J.charAt(i), 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int t;
        String jewels, stones;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0 ) {
            jewels = sc.next();
            stones = sc.next();
            System.out.println(numJewelsInStones(jewels, stones));
        }
    }
}
