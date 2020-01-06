package hackerrank;

import java.util.*;

public class CompareTheTriplets {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<>();
    int resultA = 0, resultB = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        resultA++;
      } else if (a.get(i) < b.get(i)) {
        resultB++;
      }
    }
    result.add(resultA);
    result.add(resultB);
    return result;
  }
}
