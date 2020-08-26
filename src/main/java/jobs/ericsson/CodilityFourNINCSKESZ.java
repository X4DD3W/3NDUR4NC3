package jobs.ericsson;

public class CodilityFourNINCSKESZ {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5}, 2)); // should: 5
    System.out.println(solution(new int[]{1, 1, 3, 3, 3}, 2)); // should: 4
    System.out.println(solution(new int[]{1, 1, 6, 8, 9, 9}, 3));  // should 4
  }

  // MAX 4 sort, a megoldásra törekedni, nem a perfomance-ra

  static int solution(int[] A, int K) {
    int n = A.length; // 10
    int best = 0;
    int count = 1;
    for (int i = 0; i < n - 1; i++) { // n - K - 1
      if (A[i] == A[i + 1]) {
        count = count + 1;
      } else {
        count = 0;
      }
      if (count > best) {
        best = count;
      }
    }
    int result = best + K;    // best + 1 + K

    return result;
  }

}