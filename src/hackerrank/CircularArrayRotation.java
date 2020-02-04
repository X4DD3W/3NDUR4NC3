package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {

  public static void main(String[] args) {
    int[] test = new int[]{1, 2, 3};
    int[] testQ = new int[]{0, 1, 2};
    System.out.println(Arrays.toString(circularArrayRotation(test, 2, testQ)));
  }

  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    // a: rotálnivaló
    // k: hányszor
    // queries: azok az indexek, amik az eredményből kellenek

    int[] result = new int[queries.length];
    int[] temp = new int[a.length];
    List<Integer> temps = new ArrayList<>();

    int counter = 0;
    // a: 1 2 3
    // k: 2
    // lekérdezések: 0. 1. 2.
    // result: 2, 3, 1
    for (int i = 0; i <= k; i++) {
      if (counter == k) {
        counter = 0;
      }
      counter++;

      temp[counter] = a[i];
      // temps.set(counter + 1, a[i]);
    }
    for (int i = 0; i < queries.length; i++) {
      result[i] = temps.get(queries[i]);
    }
    return result;
  }
}
