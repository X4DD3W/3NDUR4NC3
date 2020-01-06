package hackerrank;

public class BirthdayCakes {

  static int birthdayCakeCandles(int[] ar) {
    long max = 0;
    int counter = 0;
    for (int value : ar) {
      if (value > max) {
        max = value;
      }
    }
    for (int value : ar) {
      if (value == max) {
        counter++;
      }
    }
    return counter;
  }
}

