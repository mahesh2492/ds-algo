package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {

    static String appendAndDelete(String first, String second, int steps) {
        int commonLen = 0;
        int firstLen = first.length();
        int secondLen = second.length();

        if(firstLen + secondLen < steps) {
           return "Yes";
        }

        for (int i = 0; i < Math.min(firstLen, secondLen); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                commonLen++;
            } else {
                break;
            }
        }

        if ((firstLen + secondLen - 2 * commonLen) > steps) {
            return "No";
        } else if ((firstLen + secondLen - 2 * commonLen) % 2 == steps % 2) {
            return "Yes";
        } else if ((firstLen + secondLen - steps) < 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) throws IOException {
        int t, steps;
        String first, second;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            first = br.readLine();
            second = br.readLine();
            steps = Integer.parseInt(br.readLine());
            System.out.println(appendAndDelete(first, second, steps));
        }
    }
}
