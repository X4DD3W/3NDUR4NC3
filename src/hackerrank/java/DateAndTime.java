package hackerrank.java;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {

  public static void main(String[] args) {
    System.out.println(findDaySzerintem(8, 5, 2015));    // WEDNESDAY
    System.out.println(findDaySzerintem(4, 30, 2020));   // THURSDAY
    System.out.println(findDayHackerrankSzerint(8, 5, 2015));
    System.out.println(findDayHackerrankSzerint(4, 30, 2020));
  }

  private static String findDaySzerintem(int month, int day, int year) {
    return LocalDate.of(year, month, day).getDayOfWeek().name();
  }

  private static String findDayHackerrankSzerint(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
  }
}
