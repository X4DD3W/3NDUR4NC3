package hackerrank.problemsolving;

public class MiniMaxSum {

  static void miniMaxSum(int[] arr) {
    long min = arr[0];
    long max = arr[0];
    long result = 0;
    for (long value : arr) {
      if (value > max) {
        max = value;
      }
      if (value < min) {
        min = value;
      }
    }
    for (long value : arr) {
      result += value;
    }
    System.out.println((result - max) + " " + (result - min));
  }
}
