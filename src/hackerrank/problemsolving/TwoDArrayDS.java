package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayDS {

  public static void main(String[] args) {
    int[][] input = {
     //  0  1  2  3  4  5
        {1, 1, 1, 0, 0, 0},   //  012  123   234   345    -- 0
        {0, 1, 0, 0, 0, 0},   //  012  123   234   345    -- 1
        {1, 1, 1, 0, 0, 0},   //  012  123   234   345    -- 2
        {0, 0, 2, 4, 4, 0},   //  012  123   234   345    -- 3
        {0, 0, 0, 2, 0, 0},   //  012  123   234   345    -- 4
        {0, 0, 1, 2, 4, 0}};  //  012  123   234   345    -- 5
    // 4x4 homokóra összértékéből kell a legnagyobb
    System.out.println(hourglassSum(input));  // 19

    int[][] input2 = {
        {-9, -9, -9,  1, 1, 1},
        {0, -9,  0,  4, 3, 2},
        {-9, -9, -9,  1, 2, 3},
        {0,  0,  8,  6, 6, 0},
        {0,  0,  0, -2, 0, 0},
        {0,  0,  1,  2, 4, 0}};
    System.out.println(hourglassSum(input2)); // 28
  }

  static int hourglassSum(int[][] arr) {
    List<Integer> tempHourGlass = new ArrayList<>();
    List<Integer> results = new ArrayList<>();
    int fromI = 0;
    int toI = 3;
    int fromJ = 0;
    int toJ = 3;

    for (int column = 0; column < 4; column++) {
      for (int row = 0; row < 4; row++) {
        for (int i = fromI; i < toI; i++) {
          for (int j = fromJ; j < toJ; j++) {
            tempHourGlass.add(arr[i][j]);
          }
        }
        tempHourGlass.remove(3);
        tempHourGlass.remove(4);
        results.add(tempHourGlass.stream().mapToInt(num -> num).sum());
        tempHourGlass.clear();
        fromJ++;
        toJ++;
      }
      fromJ = 0;
      toJ = 3;
      fromI++;
      toI++;
    }
    return results.stream().max(Integer::compare).get();
  }
}