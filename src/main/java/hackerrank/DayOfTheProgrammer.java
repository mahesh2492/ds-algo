package hackerrank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
https://www.hackerrank.com/challenges/day-of-the-programmer/editorial
 */
public class DayOfTheProgrammer {

    static boolean isLeapYear(int year, String calendar) {
        if (calendar.equals("Julian")) {
            return year % 4 == 0 && year % 100 == 0;
        } else {
            return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        }
    }

    static String dayOfProgrammer(int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.of(year, 1, 1);

        if (year < 1918) {
            if (isLeapYear(year, "Julian")) {
                return date.plusDays(254).format(formatter);
            } else {
                return date.plusDays(255).format(formatter);
            }
        } else if (year == 1918) {
            return date.plusDays(268).format(formatter);
        } else {
            return date.plusDays(255).format(formatter);
        }

    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(1916));
    }

}
