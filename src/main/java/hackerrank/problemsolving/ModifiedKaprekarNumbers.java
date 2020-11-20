package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ModifiedKaprekarNumbers {

  public static void main(String[] args) {
    kaprekarNumbers(1, 100);  // 1 9 45 55 99
    kaprekarNumbers(100, 300);  // 297
    kaprekarNumbers(1, 99999);
    // 1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999
  }

  static void kaprekarNumbers(int p, int q) {
    List<Long> result = new ArrayList<>();

    for (long i = p; i <= q; i++) {
      int digit = Long.toString(i).length();
      String square = Long.toString(i * i);
      int right = Integer.parseInt(square.substring(square.length() - digit));
      int left = square.length() != 1
          ? Integer.parseInt(square.substring(0, square.length() - digit))
          : 0;

      if (right + left == i) {
        result.add(i);
      }
    }

    if (result.isEmpty()) {
      System.out.println("INVALID RANGE");
    } else {
      for (Long number : result) {
        System.out.print(number + " ");
      }
    }
  }

}
