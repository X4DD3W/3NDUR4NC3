import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeugroMatrix {

  public static void main(String[] args) {
    int[][] valami = new int[][]{
        {1, 2, 3},  // {7, 5, 3}
        {4, 5, 6},  // {1, 8, 6}
        {7, 8, 9}   // {4, 2, 9}
    };
    int[][] valami2 = new int[][]{
        {1, 2, 3, 4},     // {13, 10, 7, 4}
        {5, 6, 7, 8},     // {1, 14, 11, 8}
        {9, 10, 11, 12},  // {5, 2, 15, 12}
        {13, 14, 15, 16}  // {9, 6, 3, 16}
    };
    System.out.println(Arrays.deepToString(beugratos(valami)));
    System.out.println(Arrays.deepToString(viviLuna(valami2)));
  }

  private static int[][] beugratos(int[][] input) {
    int n = input.length;
    int[][] result = new int[n][n];

    List<Integer> corrigator = new ArrayList<>();
    for (int i = n - 1; i >= 0; i--) {
      corrigator.add(i);
    }
    for (int i = 0; i < n; i++) {
      int counter = 0;
      for (int j = 0; j < input[i].length; j++) {
        result[i][j] = input[corrigator.get(counter)][j];
        counter++;
      }
      corrigator.add(corrigator.get(corrigator.size() - 1));
      for (int j = 0; j < n - 1; j++) {
        corrigator.add(corrigator.get(j));
      }
      corrigator.subList(0, n).clear();
    }
    return result;
  }

  private static int[][] viviLuna(int[][] matrix) {
    int n = matrix.length;
    int[][] a = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (i + j + 1 >= n) {
          a[(j + i + 1) - n][j] = matrix[i][j];
        } else {
          a[j + i + 1][j] = matrix[i][j];
        }
      }
    }
    return a;
  }
}
