package hackerrank.problemsolving.almostdone;

public class BeautifulTriplets {

  public static void main(String[] args) {
    System.out.println(beautifulTriplets(3, new int[] {1, 2, 4, 5, 7, 8, 10})); // 3
    // (1, 4, 7), (4, 7, 10), (2, 5, 8)
    // [0, 2, 4], [2, 4, 6], [1, 3, 5]
  }

  // TODO TIME LIMIT
  static int beautifulTriplets(int d, int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (d == arr[j] - arr[i] && d == arr[k] - arr[j]) {
            result++;
          }
        }
      }
    }
    return result;
  }

}
