package hackerrank;

import java.util.*;

import static java.lang.Math.abs;

/*
https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingTheNumber {

    public static int pickingNumbers(List<Integer> numbers) {
        Collections.sort(numbers);

        List<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < numbers.size(); ++i) {
            ArrayList<Integer> nested = new ArrayList<>();
            nested.add(numbers.get(i));
            for (int j = i + 1; j < numbers.size(); ++j) {
                if (abs(numbers.get(i) - numbers.get(j)) <= 1) {
                    nested.add(numbers.get(i));
                } else {
                    break;
                }
            }

            if (!nested.isEmpty())
                arr.add(nested);
        }

        return arr.stream()
                .map(ArrayList::size)
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(0);
    }

    public static void main(String[] args) {
        Integer [] arr = {1, 4, 3, 5, 3, 6} ;

        System.out.println(pickingNumbers(Arrays.asList(arr)));
    }
}
