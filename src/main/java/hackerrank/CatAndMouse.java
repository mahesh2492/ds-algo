package hackerrank;

import java.util.Scanner;
import static java.lang.Math.abs;

/*
https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int firstCat = abs(z - x);
        int secondCat = abs(z - y);
        if (firstCat == secondCat) {
            return "Mouse C";
        } else if (firstCat > secondCat) {
            return "Cat B";
        } else {
            return "Cat A";
        }

    }

    public static void main(String[] args) {
        int t, x, y, z;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }

    }
}
