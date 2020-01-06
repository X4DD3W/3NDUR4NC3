package hackerrank;

import java.util.*;

public class TimeConversion {

  // Vivi megoldása
  static String timeConversion(String s) {
    List<String> SplittedTime = Arrays.asList(s.split(":"));
    if (SplittedTime.get(2).charAt(2) == 'P') {
      List<String> second = Arrays.asList(SplittedTime.get(2).split("P"));
      SplittedTime.set(2, second.get(0));
    } else if (SplittedTime.get(2).charAt(2) == 'A') {
      List<String> second = Arrays.asList(SplittedTime.get(2).split("A"));
      SplittedTime.set(2, second.get(0));
    }
    if (s.charAt(s.length() - 2) == 'P') {
      if ((s.charAt(0) == '1') && (s.charAt(1) == '2')) {
        return (SplittedTime.get(0) + ":" + SplittedTime.get(1) + ":" + SplittedTime.get(2));
      } else {
        int hour = (Integer.parseInt(SplittedTime.get(0))) + 12;
        return (hour + ":" + SplittedTime.get(1) + ":" + SplittedTime.get(2));
      }
    } else {
      if ((s.charAt(0) == '1') && (s.charAt(1) == '2')) {
        return ("00:" + SplittedTime.get(1) + ":" + SplittedTime.get(2));
      } else {
        return (SplittedTime.get(0) + ":" + SplittedTime.get(1) + ":" + SplittedTime.get(2));
      }
    }
  }
}
