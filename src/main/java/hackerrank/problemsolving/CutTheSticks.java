package hackerrank.problemsolving;

import java.util.Arrays;

public class CutTheSticks {

  public static void main(String[] args) {
    int[] arr = new int[]{5, 4, 4, 2, 2, 8};  // 6, 4, 2, 1
    System.out.println(Arrays.toString(cutTheSticks(arr)));
    int[] arr2 = new int[]{1, 2, 3, 4, 3, 3, 2, 1};  // 8, 6, 4, 1
    System.out.println(Arrays.toString(cutTheSticks(arr2)));
  }

  private static int[] cutTheSticks(int[] arr) {
    int[] result = new int[arr.length];
    int counter = 0;

    for (int i = 0; i < arr.length; i++) {
      int shortest = Arrays.stream(arr).filter(n -> n > 0).min().orElse(0);
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > 0) {
          counter++;
          arr[j] -= shortest;
        }
      }
      result[i] = counter;
      counter = 0;
    }
    return Arrays.stream(result).filter(r -> r > 0).toArray();
  }
}
