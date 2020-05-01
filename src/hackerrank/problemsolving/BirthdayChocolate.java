package hackerrank.problemsolving;

import java.util.*;

public class BirthdayChocolate {

  static int birthday(List<Integer> s, int d, int m) {
    int temp = 0;
    int counter = 0;
    for (int i = 0; i <= s.size() - m; i++) {
      for (int j = i; j <= i + (m - 1); j++) {
        temp += s.get(j);
      }
      if (temp == d) {
        counter++;
      }
      temp = 0;
    }
    return counter;
  }
}
