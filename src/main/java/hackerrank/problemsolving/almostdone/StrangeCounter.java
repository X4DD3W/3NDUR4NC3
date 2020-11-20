package hackerrank.problemsolving.almostdone;

public class StrangeCounter {

  public static void main(String[] args) {
    System.out.println(strangeCounter(6));  // 4
    System.out.println(strangeCounter(13)); // 9
    System.out.println(strangeCounter(9));  // 1
    // a: t
    // 3: 3
    // 6: 9
    // 12: 21
    // 24: 45 (mindig előző t és aktuális "a" összege)
  }

  // TODO TIME LIMIT
  static long strangeCounter(long t) {
    long value = 3;
    long time = 1;
    long temp = 3;

    while (time < t) {
      time++;
      temp--;

      if (time == t) {
        break;
      }

      if (temp == 1) {
        temp = value *= 2;
        time++;
      }
    }
    return temp;
  }

}
