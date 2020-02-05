package hackerearth.codemonk;

import java.util.Scanner;

/*
https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/monk-teaches-palindrome/description/
 */
public class MonkTeachesPalindrome {

    public static void reverse(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        if (input.equals(result.toString())) {
            if (input.length() % 2 == 0) {
                System.out.println("YES" + " " + "EVEN");
            } else {
                System.out.println("YES" + " " + "ODD");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            reverse(str);
        }
    }
}
