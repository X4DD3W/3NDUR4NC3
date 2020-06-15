package hackerrank.problemsolving.nincskesz;

import java.util.Arrays;

public class CutTheSticks {

  public static void main(String[] args) {
    int[] arr = new int[]{5, 4, 4, 2, 2, 8};
    System.out.println(Arrays.toString(cutTheSticks(arr)));
  }

  private static int[] cutTheSticks(int[] arr) {
    // sticks-length        length-of-cut  sticks-cut
    // 5 4 4 2 2 8             2               6
    // 3 2 2 _ _ 6             2               4
    // 1 _ _ _ _ 4             1               2
    // _ _ _ _ _ 3             3               1
    // _ _ _ _ _ _            DONE            DONE
    int[] result = new int[]{};



    return result;
  }
}
