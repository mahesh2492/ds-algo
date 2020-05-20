package leetcode.may.challenge;

import java.util.*;
/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3334/
 */
public class StockSpanner {
        List<Integer> stocks;
        public StockSpanner() {
            stocks = new ArrayList<>();
        }

        public int next(int price) {
            if(stocks.isEmpty()) {
                stocks.add(price);
                return 1;
            } else {
               int count = 1;

                for(int i = stocks.size() - 1; i >= 0; i--) {
                    if(stocks.get(i) <= price) {
                        count = count + 1;
                    } else {
                        break;
                    }
                }

                stocks.add(price);
                return count;
            }
        }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        StockSpanner sp = new StockSpanner();
        while (t-- > 0) {
            int k = sc.nextInt();
            System.out.println(sp.next(k));
        }
    }
}
