package leetcode.may.challenge;

import java.util.*;
import java.util.stream.Collectors;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums) {
            if(hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        int maxKey = 0, maxValue = 0;
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        int t, size;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();

            int []arr = new int[size];

            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(majorityElement(arr));
        }
    }
}
