package hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for(int g : grades) {
          if(g < 38) {
              roundedGrades.add(g);
          } else if((5 - g % 5) < 3) {
              roundedGrades.add(g + (5 - g % 5));
          } else {
              roundedGrades.add(g);
          }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

       gradingStudents(grades)
               .forEach(System.out::println);
    }
}
