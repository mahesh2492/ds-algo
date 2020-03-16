package hackerrank;

import java.util.Arrays;
import java.util.List;

/*
https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
class BirthDayChocolate {

    static int birthday(List<Integer> list, int d, int m) {
       int count = 0;

       for(int i = 0; i < list.size(); i++) {
          int sum = 0;
          for(int j = i; j < i + m && j < list.size(); ++j) {
              sum += list.get(j);
          }

          if(sum == d) {
              count++;
          }
       }

       return count;
    }

    public static void main(String[] args) {
       Integer[] arr = {1, 2, 1, 3, 2};
       List<Integer> dates = Arrays.asList(arr);

       System.out.println(birthday(dates, 3, 2));
    }
}
