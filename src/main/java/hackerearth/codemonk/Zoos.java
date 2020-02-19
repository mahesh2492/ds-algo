package hackerearth.codemonk;

import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
 */
public class Zoos {

    public static boolean isZoo(String input) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
           if(hashMap.containsKey(input.charAt(i))) {
               hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)) + 1);
           } else {
               hashMap.put(input.charAt(i), 1);

           }
        }

        return 2 * hashMap.get('z') ==  hashMap.get('o');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String input = sc.next();

            if(isZoo(input)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
