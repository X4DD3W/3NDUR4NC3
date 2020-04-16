package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PyrArr {

  public static void main(String[] args) {
    int[] szamok = new int[]{2, 5, 8, 9, 10, 1, 3, -2};
    System.out.println(sorter(szamok));
    // párosak növekvő, páratlan csökkenő
    // should return: -2, 2, 8, 10, 1, 3, 5, 9
  }

  private static int[] sorter(int[] input) {
    int[] result = new int[input.length];
    List<Integer> paros = new ArrayList<>();
    List<Integer> paratlan = new ArrayList<>();
    Arrays.sort(input);
    for (int value : input) {
      if (value % 2 == 0) {
        paros.add(value);
      } else {
        paratlan.add(value);
      }
    }
    for (int i = 0; i < paros.size(); i++) {
      result[i] = paros.get(i);
      result[paros.size() + i] = paratlan.get(i);
    }
    return result;
  }
}
