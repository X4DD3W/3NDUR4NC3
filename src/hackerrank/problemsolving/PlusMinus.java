package hackerrank.problemsolving;

public class PlusMinus {

  static void plusMinus(int[] arr) {
    double positive = 0;
    double negative = 0;
    double zero = 0;
    for (int value : arr) {
      if (value > 0) {
        positive++;
      }
      if (value < 0) {
        negative++;
      }
      if (value == 0) {
        zero++;
      }
    }
    System.out.println(positive / arr.length);
    System.out.println(negative / arr.length);
    System.out.println(zero / arr.length);
  }
}
