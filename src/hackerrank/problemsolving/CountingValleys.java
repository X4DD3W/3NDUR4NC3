package hackerrank.problemsolving;

public class CountingValleys {

  static int countingValleys(int n, String s) {
    char[] way = s.toCharArray();
    int counter = 0;
    int level;
    boolean heIsInValley = false;
    if (way[0] == 'U') {
      level = 1;
    } else {
      level = -1;
      heIsInValley = true;
    }
    for (int i = 1; i < n; i++) {
      if (way[i] == 'U') {
        level += 1;
      } else {
        if (level == 0) {
          heIsInValley = true;
        }
        level -= 1;
      }
      if (level == 0 && heIsInValley) {
        counter++;
        heIsInValley = false;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    System.out.println(countingValleys(8, "UDDDUDUU"));
  }
}
