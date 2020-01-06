package hackerrank;

import java.util.*;

class GradingStudents {

  public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> result = new ArrayList<>();
    for (int number : grades) {
      if (number < 38) {
        result.add(number);
      } else {
        if ((number - 3) % 5 == 0) {
          result.add(number + 2);
        } else if ((number - 4) % 5 == 0) {
          result.add(number + 1);
        } else {
          result.add(number);
        }
      }
    }
    return result;
  }
}

