package hackerrank;

public class FirstTask {

  static int simpleArraySum(int[] ar) {
    int result = 0;
    for (int value : ar) {
      result += value;
    }
    return result;
  }
}
