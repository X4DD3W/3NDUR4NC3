package jobs.ericsson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CodilityThree {
  // https://leetcode.com/discuss/interview-question/algorithms/185640/Microsoft-Question/273214
  public static void main(String[] args) {
    // A: 6, 1, 4, 6, 3, 2, 7, 4 K: 3, L: 2
    // a legmagasabb pontszámot kell mindkettejüknek szedni, csak egymás melletti fákról
    System.out.println(solution(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2));
  }

  public static int solution(int[] A, int K, int L) {
    if (A.length < (K + L)) {
      return -1;
    }

    int aliceHighest = 0;
    int bobHighest = 0;
    int temp = 0;
    HashMap<Integer, List<Integer>> set = new HashMap<>();

    // aliceHighest
    for (int j = 0; j < A.length - K; j++) {
      for (int i = j; i < K + j; i++) {
        temp += A[i];
      }
      List<Integer> temptList = new ArrayList<>(Arrays.asList(j, j + 1, j + 2));
      if (aliceHighest <= temp) {
        aliceHighest = temp;
        set.put(aliceHighest, temptList);
      }
      temp = 0;
    }

    // set aliceHighest indices to 0
    for (int i = 0; i < K; i++) {
      A[set.get(aliceHighest).get(i)] = 0;
    }

    // bobHighest
    for (int j = 0; j < A.length - 1; j++) {
      for (int i = j; i < L + j; i++) {
        temp += A[i];
      }
      if (bobHighest <= temp) {
        bobHighest = temp;
      }
      temp = 0;
    }
    // Is this the best solution? No.
    return aliceHighest + bobHighest;
  }
}
