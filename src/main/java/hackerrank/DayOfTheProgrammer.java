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
        int daysInFeb = 0;

        if (year < 1918) {
            if (year % 4 == 0) {
                daysInFeb = 29;
            } else {
                daysInFeb = 28;
            }
        } else if (year == 1918) {
            daysInFeb = 15;
        } else {
            if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                daysInFeb = 29;
            } else {
                daysInFeb = 28;
            }
        }

       int day = 256 - (31 + daysInFeb + 31 + 30 + 31 + 30 + 31 + 31);
       return String.format("%d.09.%d", day, year);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(1919));
    }

}
