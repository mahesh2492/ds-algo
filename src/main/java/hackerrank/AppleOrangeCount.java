package hackerrank;

/*
https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleOrangeCount {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long applesCount = 0, orangesCount = 0;

        for (int apple : apples) {
            int d = a + apple;
            if (d >= s && d <= t) {
                applesCount++;
            }
        }

        for (int orange : oranges) {
            int d = b + orange;
            if (d >= s && d <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);
    }

    public static void main(String[] args) {

        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }
}
