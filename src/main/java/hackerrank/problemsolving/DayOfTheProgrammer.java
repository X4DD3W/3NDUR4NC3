package hackerrank.problemsolving;

public class DayOfTheProgrammer {

  static String dayOfProgrammer(int year) {
    String dayOfALeapYear = "12.09.";
    String dayOfANormalYear = "13.09.";
    String returnValue = "";
    if (year == 1918) {
      returnValue = "26.09.1918";
    } else if (year >= 1918) {
      if (year % 400 == 0) {
        returnValue += dayOfALeapYear + year;
      } else if ((year % 4 == 0) && (year % 100 != 0)) {
        returnValue += dayOfALeapYear + year;
      } else if (((year % 4 != 0) && (year % 100 == 0))) {
        returnValue += dayOfALeapYear + year;
      } else {
        returnValue += dayOfANormalYear + year;
      }
    } else {
      if (year % 4 == 0) {
        returnValue += dayOfALeapYear + year;
      } else {
        returnValue += dayOfANormalYear + year;
      }
    }
    return returnValue;
  }
}
