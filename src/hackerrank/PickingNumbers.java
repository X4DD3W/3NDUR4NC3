package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

  public static void main(String[] args) {
    List<Integer> test = new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1));
    List<Integer> test2 = new ArrayList<>(Arrays
        .asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9,
            3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98,
            98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4));
    System.out.println(pickingNumbers(test2));
  }

  public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int counter = 1;
    int temp = 0;
    for (int i = 0; i < a.size() - 1; i++) {
      for (int j = i + 1; j <= a.size() - 1; j++) {
        if (Math.abs(a.get(i) - a.get(j)) <= 1) {
          counter++;
        }
      }
      if (temp < counter) {
        temp = counter;
      }
      counter = 1;
    }
    return Math.max(temp, counter);
  }
}
