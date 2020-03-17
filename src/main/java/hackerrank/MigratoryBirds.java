package hackerrank;

import java.util.*;

/*
https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      hm.put(1, 0);
      for(int a: arr) {
          if(hm.containsKey(a)) {
              hm.put(a, hm.get(a) + 1);
          } else {
              hm.put(a, 1);
          }
      }

        int max = Collections.max(hm.values());

        Optional<Map.Entry<Integer, Integer>> maybeMin =
                hm.entrySet()
                        .stream()
                        .filter(e -> e.getValue() == max)
                        .min(Comparator.comparingInt(Map.Entry::getKey));

       int min = 0;
        if(maybeMin.isPresent()) {
            min = maybeMin.get().getKey();
        }
        return min ;
    }

    public static void main(String[] args) {
      Integer []arr = {1, 4, 4, 4, 5 ,3};
      List<Integer> list = Arrays.asList(arr);
        System.out.println(migratoryBirds(list));
    }
}
