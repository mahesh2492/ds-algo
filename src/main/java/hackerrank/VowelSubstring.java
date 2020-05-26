package hackerrank;

import java.util.Scanner;

public class VowelSubstring {
    public static String findSubstring(String s, int k) {
        String result = "";
        int vowels = 0, firstVowel, i, j;

        for (i = 0; i < s.length(); ) {
            StringBuilder sb = new StringBuilder();
            int newVowels = 0;
            firstVowel = 0;
            for (j = i; j < i + k && j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    newVowels++;
                    if (firstVowel == 0) {
                        firstVowel = j - 1;
                    }
                }
                sb.append(c);
            }

            i = i + firstVowel;
            if (vowels < newVowels) {
                result = sb.toString();
                vowels = newVowels;
            }
        }
        if (vowels == 0) {
            return "Not Found!";
        }
        return result;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            String input = sc.next();
            int k = sc.nextInt();

            System.out.println(findSubstring(input, k));
        }
    }
}
