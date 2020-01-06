package hackerrank;

import java.util.*;

class BetweenTwoSets {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    int result = 0;
    int biggest = 0;

    for (Integer number : b) {
      if (number > biggest) {
        biggest = number;
      }
    }

    int zerosNumber = 0;
    for (int i = 1; i <= biggest; i++) {
      for (Integer integer : a) {
        if (i % integer == 0) {
          zerosNumber++;
        }
      }
      for (Integer integer : b) {
        if (integer % i == 0) {
          zerosNumber++;
        }
      }
      if (zerosNumber == (a.size() + b.size())) {
        result++;
      }
      zerosNumber = 0;
    }
    return result;
  }
}