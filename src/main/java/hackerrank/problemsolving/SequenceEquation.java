package hackerrank.problemsolving;

import java.util.Arrays;

public class SequenceEquation {

  public static void main(String[] args) {
    int[] p = new int[]{2, 3, 1};
    System.out.println(Arrays.toString(permutationEquation(p)));
  }

  private static int[] permutationEquation(int[] p) {
    int[] result = new int[p.length];
    int actNumber = 1;
    int temp = 0;
    int x = 0;

    for (int i = 0; i < p.length; i++) {
      for (int j = 0; j < p.length; j++) {
        if (actNumber == p[j]) {
          temp = j + 1;
          break;
        }
      }
      for (int j = 0; j < p.length; j++) {
        if (temp == p[j]) {
          x = j + 1;
          break;
        }
      }
      result[i] = x;
      actNumber++;
    }
    return result;
  }
}
