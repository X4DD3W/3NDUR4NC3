package hackerrank.java;

public class TwoDArray {

  public static void main(String[] args) {
    int[][] arr = new int[][]{
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 9, 2, -4, -4, 0},
        {0, 0, 0, -2, 0, 0},
        {0, 0, -1, -2, -4, 0}
    };
    largestHourGlassFinder(arr);
    // NEM JÓ :D
  }

  private static void largestHourGlassFinder(int[][] arr) {
    int toPrint = 0;
    for (int i = 0; i < arr.length; i++) {
      int temp = 0;
      for (int j = 0; j < arr[i].length - 3; j++) {
        if (arr[i][j] != 0 && arr[i][j + 1] != 0 && arr[i][j + 2] != 0 && i <= 3) {
          temp += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
          temp += arr[i + 1][j + 1];
          temp += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        }
        if (temp > toPrint) {
          toPrint = temp;
        }
      }
    }
    System.out.println(toPrint);
  }
}
