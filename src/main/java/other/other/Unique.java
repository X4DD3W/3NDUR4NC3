package other.other;

import java.util.ArrayList;
import java.util.List;

public class Unique {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    int[] test = new int[]{1, 11, 34, 11, 52, 61, 1, 34};
    System.out.println(unique(test));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  private static List<Integer> unique(int[] input) {
    List<Integer> result = new ArrayList<>();
    for (int value : input) {
      if (!result.contains(value)) {
        result.add(value);
      }
    }
    return result;
  }
}
