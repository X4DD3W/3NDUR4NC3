package hackerrank;

public class TheHurdleRace {

  static int hurdleRace(int k, int[] height) {
    int max = 0;
    for (int value : height) {
      if (max < value) {
        max = value;
      }
    }
    int result;
    if (k > max) {
      result = 0;
    } else {
      result = max - k;
    }
    return result;
  }
}
