import java.util.Arrays;
  // CHAMA FOUNDATION NORMAL EXAM
public class GreatestValuesInMatrices {

  public static void main(String[] args) {
    int[][] test = new int[][]{
        {2, 1, 4},
        {0, 1, 5},
        {4, 4, 8}
    };
    int[][] test2 = new int[][]{
        {0, 3, 9},
        {-1, 1, 6},
        {4, 6, 7}
    };
    // [[2, 3, 9], [0, 1, 6], [4, 6, 8]]
    // System.out.println(Arrays.deepToString(greatestValuePicker(test, test2)));
  }

  public int[][] greatestValuePicker(int[][] matrixOne, int[][] matrixTwo) {
    int n = matrixOne.length;
    int[][] result = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        result[i][j] = Math.max(matrixOne[i][j], matrixTwo[i][j]);
      }
    }
    return result;
  }
}
