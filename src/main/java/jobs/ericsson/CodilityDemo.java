package jobs.ericsson;

import java.util.Arrays;

public class CodilityDemo {

  // https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
  public static void main(String[] args) {
    System.out.println(megoldas(new int[]{1, 3, 6, 4, 1, 2}));  // 5
    System.out.println(megoldas(new int[]{1, 2, 3}));           // 4
    System.out.println(megoldas(new int[]{-1, -3}));            // 1
  }

  public static int megoldas(int[] a) {
    Arrays.sort(a);
    for (int i = 1; i <= a.length + 1; i++) {
      int actual = i;
      if (Arrays.stream(a).noneMatch(n -> n == actual)) {
        return i;
      }
    }
    return 1;
  }
}
