package leetcode.may.challenge;

import java.util.HashMap;
import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/
 */
public class RansomNote {

       public static HashMap<Character, Integer> getMapOfLetters(String input) {
           HashMap<Character, Integer> first = new HashMap<>();

           for(int i = 0; i < input.length(); i++) {
               char c = input.charAt(i);
               if(first.containsKey(c)) {
                   first.put(c, first.get(c) + 1);
               } else {
                   first.put(c, 1);
               }
           }

           return first;
       }

        public static boolean canConstruct(String ransomNote, String magazine) {
           int i, j;
            if(ransomNote.length() > magazine.length()) {
              return false;
          }

            HashMap<Character, Integer> first = getMapOfLetters(ransomNote);

            HashMap<Character, Integer> second = getMapOfLetters(magazine);

            for(i = 0; i < ransomNote.length(); i++) {
                char c = ransomNote.charAt(i);
                if(second.containsKey(c)) {
                    if(first.get(c) > second.get(c)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int t;
        String ransoneNote, magazine;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            ransoneNote = sc.next();
            magazine = sc.next();

            System.out.println(canConstruct(ransoneNote, magazine));
        }
    }
}
