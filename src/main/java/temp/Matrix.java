package temp;

import java.util.Arrays;

public class Matrix {
  // - Create (dynamically*) a two dimensional list with the following matrix**. Use a loop!
  //   0 0 0 1
  //   0 0 1 0
  //   0 1 0 0
  //   1 0 0 0
  // - Print this two dimensional list to the console
  // * size should depend on a variable
  // ** Relax, a matrix is just like an array

  public static void main(String[] args) {
    int n = 4;
    matrixCreator(n);
  }

  static void matrixCreator(int n) {
    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (j + 1 == array[i].length - i) ? 1 : 0;
      }
    }
    System.out.println(Arrays.deepToString(array));
  }

}
