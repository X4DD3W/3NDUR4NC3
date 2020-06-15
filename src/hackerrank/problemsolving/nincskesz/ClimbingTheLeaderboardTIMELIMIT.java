package hackerrank.problemsolving.nincskesz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboardTIMELIMIT {

  public static void main(String[] args) {
    /*int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
    int[] alice = new int[]{5, 25, 50, 120};
    *//*System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));
    newMethod(scores, alice);*//*
    streamMethod(scores, alice);*/

    int[] scores2 = new int[]{100, 90, 90, 80, 75, 60};
    int[] alice2 = new int[]{50, 65, 77, 90, 102};
    /*System.out.println(Arrays.toString(climbingLeaderboard(scores2, alice2)));
    newMethod(scores2, alice2);*/
    streamMethod(scores2, alice2);
  }

  private static void streamMethod(int[] scores, int[] alice) {
    int[] distinctScores = Arrays.stream(scores).distinct().toArray();
    int actualPos = distinctScores.length; // length: 5
    int counter = distinctScores.length;
    for (int aliceScore : alice) {
      for (int i = actualPos - 1; i >= 0; i--) {   // i: 4
        if (aliceScore <= distinctScores[i]) {
          System.out.println(counter);
          break;
        }
      }
      break;
    }
  }

  private static void newMethod(int[] scores, int[] alice) {
    // szintén időtúllépés...
    int[] distinctScores = Arrays.stream(scores).distinct().toArray();
    int i = distinctScores.length - 1;

    for (int aliceScore : alice) {
      while (i >= 0) {
        if (aliceScore >= distinctScores[i]) {
          i--;
        } else {
          System.out.println(i + 2);
          break;
        }
      }
      if (i < 0) {
        System.out.println(1);
      }
    }
  }

  private static int[] climbingLeaderboard(int[] scores, int[] alice) {
    // ORIGINAL:
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
