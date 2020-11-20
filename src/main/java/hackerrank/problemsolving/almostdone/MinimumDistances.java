package hackerrank.problemsolving.almostdone;

public class MinimumDistances {

  public static void main(String[] args) {
    System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));  // 3 (1. és 4. különbsége 3)
    System.out.println(minimumDistances(new int[]{3, 2, 1, 2, 3}));  // 2 (1. és 3. különbsége 2)
  }

  static int minimumDistances(int[] a) {
    int actualDistance = 0;
    int minDistance = 2147483646;

    for (int i = 0; i < a.length; i++) {
      int temp = a[i];
      for (int j = i + 1; j < a.length; j++) {
        if (temp == a[j]) {
          actualDistance = j - i;
        }
      }
      if (actualDistance < minDistance) {
        minDistance = actualDistance;
      }
    }

    return minDistance == 0 ? -1 : minDistance;
  }

}
