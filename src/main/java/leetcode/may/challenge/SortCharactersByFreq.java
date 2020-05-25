package leetcode.may.challenge;

import java.util.*;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3337/
 */
public class SortCharactersByFreq {

    public String frequencySort(String s) {
        HashMap<Character, String> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + c);
            } else {
                hashMap.put(c, c + "");
            }
        }

        List<Map.Entry<Character, String>> list = new LinkedList<>(hashMap.entrySet());

        list.sort((first, second) -> second.getValue().length() - first.getValue().length());

        String result = "";
        for(Map.Entry<Character, String> l: list) {
            result += l.getValue();
        }
        return result;
    }

    public static void main(String[] args) {
       SortCharactersByFreq scf = new SortCharactersByFreq();

       int t;
       Scanner sc = new Scanner(System.in);
       t = sc.nextInt();

       while (t-- > 0) {
           String input = sc.next();

           System.out.println(scf.frequencySort(input));
       }
    }
}
