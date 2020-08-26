package hackerrank.problemsolving;

import java.util.Arrays;

public class CircularArrayRotation {

  public static void main(String[] args) {
    int[] test = new int[]{1, 2, 3};
    int[] test2 = new int[]{1, 2, 3, 4, 5, 6};
    int[] testQ = new int[]{0, 1, 2};
    int[] testQ2 = new int[]{0};

    // [2, 3, 1] - [2, 3, 1]
    System.out.println(Arrays.toString(circularArrayRotation(test, 2, testQ)));
    // [6, 1, 2, 3, 4, 5] - [6]
    System.out.println(Arrays.toString(circularArrayRotation(test2, 1, testQ2)));
  }

  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int[] temp = new int[a.length];
    int[] result = new int[queries.length];
    int y = 0;
    int maradek = k % a.length;

    for (int i = 0; i < a.length; i++) {
      if ((i + maradek) >= temp.length) {
        temp[y] = a[i];
        y++;
      } else {
        temp[i + maradek] = a[i];
      }
    }

    for (int i = 0; i < queries.length; i++) {
      result[i] = temp[queries[i]];
    }

    return result;
  }
}
