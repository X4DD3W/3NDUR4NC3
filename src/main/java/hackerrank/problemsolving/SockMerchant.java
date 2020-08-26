package hackerrank.problemsolving;

import java.util.Arrays;

public class SockMerchant {

  static int sockMerchant(int n, int[] ar) {
    Arrays.sort(ar);
    int returnValue = 0;
    for (int j = 1; j <= 100; j++) {
      int counter = 0;
      for (int i = 0; i < n; i++) {
        if (ar[i] == j) {
          counter++;
        }
      }
      returnValue += counter / 2;
    }
    return returnValue;
  }
}
