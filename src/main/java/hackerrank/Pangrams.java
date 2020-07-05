package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/pangrams/problem?h_r=next-challenge&h_v=zen
 */
public class Pangrams {

    static String pangrams(String s) {
        HashMap<Character, Integer> letters = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch)) {
                if(letters.containsKey(ch)) {
                    letters.put(ch, letters.get(ch) + 1);
                } else {
                    letters.put(ch, 1);
                }
            }
        }

        if(letters.keySet().size() >= 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            input = sc.nextLine();
            System.out.println(pangrams(input));
        }
      }
}
