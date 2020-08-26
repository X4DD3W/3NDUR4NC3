package hackerrank.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {

  public static void main(String[] args) {
    int[] test1 = new int[]{3, 3, 2, 1, 3};
    System.out.println(equalizeArray(test1)); // 2 (2, 1)
    int[] test2 = new int[]{1, 2, 3, 1, 2, 3, 3, 3};
    System.out.println(equalizeArray(test2)); // 4 (1, 2, 1, 2)
    int[] test3 = new int[]{95, 95, 95, 33, 95, 95, 33, 33, 33, 95, 33, 95, 95, 95, 95, 95, 95, 95,
        95, 95, 95, 95, 95, 33, 33, 95, 95, 95, 95, 33, 33, 33, 95, 33, 33, 33, 33, 33, 95, 95, 95,
        95, 95, 33};
    System.out.println(equalizeArray(test3)); // 16
  }

  static int equalizeArray(int[] arr) {
    // put numbers and occurencies in a map
    HashMap<Integer, Integer> numbers = new HashMap<>();
    for (int item : arr) {
      if (!numbers.containsKey(item)) {
        numbers.put(item, 1);
      } else {
        numbers.put(item, numbers.get(item) + 1);
      }
    }

    // declare the number with most occurencies
    Map.Entry<Integer, Integer> maxEntry = null;

    for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }

    // delete all other numbers
    int counter = 0;
    for (int value : arr) {
      if (maxEntry != null && value != maxEntry.getKey()) {
        counter++;
      }
    }
    return counter;
  }
}
