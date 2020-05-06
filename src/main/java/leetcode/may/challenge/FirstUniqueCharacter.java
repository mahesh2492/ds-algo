package leetcode.may.challenge;

import java.util.HashMap;
import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/
 */
public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int i;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            input = sc.next();
            System.out.println(firstUniqChar(input));
        }
    }
}
