package other.other;

public class SymmetricMatrix {
  // CHAMA FOUNDATION TRIAL EXAM
  public static void main(String[] args) {
    int[][] test = new int[][] {
        {1, 0, 1},
        {0, 5, 2},
        {1, 2, 7}
    };
    // System.out.println(isSymmetric(test));

  }

  public boolean isSymmetric(int[][] matrix) {
    boolean result = true;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          result = false;
          break;
        }
      }
    }
    return result;
  }
}
