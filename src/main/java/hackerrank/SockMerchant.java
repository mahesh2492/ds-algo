package hackerrank;

import java.util.HashMap;

/*
https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> socks = new HashMap<>();

        for(int i = 0;  i < n; i++) {
            if(!socks.containsKey(ar[i])) {
                socks.put(ar[i], 1);
            } else {
                socks.put(ar[i], socks.get(ar[i]) + 1);
            }
        }

        int pairs = 0;
        for (int v: socks.values()) {
            pairs += v/2;
        }

        return pairs;
    }

    public static void main(String[] args) {
      int []sock = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
        System.out.println(sockMerchant(20, sock));
    }
}
