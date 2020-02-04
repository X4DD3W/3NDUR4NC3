import java.util.Arrays;
// CHAMA FOUNDATION EXAMPLE EXAM
public class MatrixRotate {

  public static void main(String[] args) {
    int[][] test = new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    System.out.println(Arrays.deepToString(rotateMatrix(test)));
  }

  public static int[][] rotateMatrix(int[][] intput) {
    int n = intput.length;
    int[][] result = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < intput[i].length; j++) {
        result[j][n - 1 - i] = intput[i][j];
      }
    }
    return result;
  }
}
