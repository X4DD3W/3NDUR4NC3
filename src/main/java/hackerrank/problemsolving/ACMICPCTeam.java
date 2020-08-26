package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.HashMap;

public class ACMICPCTeam {

  public static void main(String[] args) {
    String[] test1 = new String[]{"10101", "11110", "00010"};
    System.out.println(Arrays.toString(acmTeam(test1))); // max: 5, 1 kombo (1,2) teljesíti
    String[] test2 = new String[]{"10101", "11100", "11010", "00101"};
    System.out.println(Arrays.toString(acmTeam(test2))); // max: 5, 2 kombo (1,3), (3,4) teljesíti
  }

  static int[] acmTeam(String[] topic) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    for (int i = 0; i < topic.length; i++) {
      for (int j = i + 1; j < topic.length; j++) {

        int x = 0;
        int counter = 0;

        while (counter != topic[0].length()) {
          if (topic[i].charAt(counter) == '1' || topic[j].charAt(counter) == '1') {
            x++;
          }
          counter++;
        }

        if (map.containsKey(x)) {
          map.put(x, map.get(x) + 1);
        } else {
          map.put(x, 1);
        }

        if (x > max) {
          max = x;
        }
      }
    }

    result[0] = max;
    result[1] = map.get(max);
    return result;
  }
}
