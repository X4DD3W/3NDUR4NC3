package hackerrank.problemsolving;

public class AVeryBigSum {

  static long aVeryBigSum(long[] ar) {
    long result = 0;
    for (long number : ar) {
      result += number;
    }
    return result;
  }
}
