package other.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutualElements {
  // CHAMA FOUNDATION RERETAKE EXAM
  public static void main(String[] args) {

    List<Integer> test = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 7));
    List<Integer> test2 = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6, 7, 9, 11, 10));
    System.out.println(collector(test, test2));
  }

  public static List<Integer> collector(List<Integer> listA, List<Integer> listB) {
    List<Integer> result = new ArrayList<>();

    if (listA.size() > listB.size()) {
      for (Integer number : listB) {
        if (listA.contains(number) && !result.contains(number)) {
          result.add(number);
        }
      }
    } else {
      for (Integer number : listA) {
        if (listB.contains(number) && !result.contains(number)) {
          result.add(number);
        }
      }
    }
    return result;
  }
}
