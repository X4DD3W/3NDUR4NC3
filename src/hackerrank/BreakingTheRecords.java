package hackerrank;

public class BreakingTheRecords {

  static int[] breakingRecords(int[] scores) {
    int highest = scores[0];
    int lowest = scores[0];
    int highResult = 0;
    int lowResult = 0;

    for (int score : scores) {
      if (score > highest) {
        highResult++;
        highest = score;
      }
      if (score < lowest) {
        lowResult++;
        lowest = score;
      }
    }
    int[] result = new int[2];
    result[0] = highResult;
    result[1] = lowResult;
    return result;
  }
}
