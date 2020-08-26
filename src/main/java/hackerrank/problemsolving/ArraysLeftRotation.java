package hackerrank.problemsolving;

import java.util.Arrays;

public class ArraysLeftRotation {

  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(rotLeft(array, 4))); // 5 1 2 3 4
  }

  static int[] rotLeft(int[] a, int d) {
    int[] result = new int[a.length];
    int y = 0;
    for (int i = 0; i < a.length; i++) {
      if (a.length - d + i >= a.length) {
        result[y] = a[i];
        y++;
      } else {
        result[a.length - d + i] = a[i];
      }
    }
    return result;
  }
}