package hackerrank;

/*
https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {

    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while (i + 1 < sb.length()) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                i = 0;
            } else {
                i++;
            }
        }

        if (sb.length() == 0) {
            return "Empty String";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aa"));
        System.out.println(superReducedString("aac"));
        System.out.println(superReducedString("baab"));
        StringBuilder sb = new StringBuilder("aaabccddd");
        System.out.println(superReducedString("aaabccddd"));
    }
}
