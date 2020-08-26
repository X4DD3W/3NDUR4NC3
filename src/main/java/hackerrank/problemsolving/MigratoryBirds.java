package hackerrank.problemsolving;

import java.util.*;

public class MigratoryBirds {

  static int migratoryBirds(List<Integer> arr) {
    List<Integer> numberOfTypes = new ArrayList<>();
    numberOfTypes.add(0, 0);
    for (int i = 1; i <= 5; i++) {
      int counter = 0;
      for (Integer typeOfBird : arr) {
        if (typeOfBird.equals(i)) {
          counter++;
        }
      }
      numberOfTypes.add(counter);
    }
    int max = 0;
    int maxIndex = 0;
    for (int i = 1; i <= 5; i++) {
      if (numberOfTypes.get(i) > max) {
        max = numberOfTypes.get(i);
        maxIndex = i;
      }
    }
    return maxIndex;
  }
}
