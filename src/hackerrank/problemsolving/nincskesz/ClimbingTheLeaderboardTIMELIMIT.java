package hackerrank.problemsolving.nincskesz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboardTIMELIMIT {

  public static void main(String[] args) {
    int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
    int[] alice = new int[]{5, 25, 50, 120};
    System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));

    int[] scores2 = new int[]{100, 90, 90, 80, 75, 60};
    int[] alice2 = new int[]{50, 65, 77, 90, 102};
    System.out.println(Arrays.toString(climbingLeaderboard(scores2, alice2)));
  }

  private static int[] climbingLeaderboard(int[] scores, int[] alice) {
    int[] result = new int[alice.length];
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < alice.length; i++) {
      int counter = 1;
      for (int score : scores) {
        if (score > alice[i]) {
          if (!numbers.contains(score)) {
            counter++;
          }
        } else {
          break;
        }
        numbers.add(score);
      }
      result[i] = counter;
      numbers.clear();
    }
    return result;
  }
}
