package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheCloudsRevisited {

  public static void main(String[] args) {
    int[] c = new int[]{0, 0, 1, 0, 0, 1, 1, 0};
    int[] c2 = new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
    System.out.println(jumpingOnClouds(c, 2));
    System.out.println(jumpingOnClouds(c2, 3));
  }

  private static int jumpingOnClouds(int[] c, int k) {
    // változók
    int e = 100;
    int counter = 0;
    List<Integer> numbers = new ArrayList<>();

    // maradékos osztás eredménye meghatározza,
    // hányszor megyünk körbe, amíg pont az array 1. elemére ugrunk
    switch (c.length % k) {
      case 0:
        counter = 1;
        break;
      case 1:
        counter = 3;
        break;
      case 2:
        counter = 2;
        break;
    }

    // létrehozzuk az array-ből a listát (annyiszor hozzáadjuk az array-t, ahány kört megyük majd
    for (int i = 0; i < counter; i++) {
      for (int value : c) {
        numbers.add(value);
      }
    }
    // kell egy 1. elem a végére
    numbers.add(c[0]);

    // végigmegyünk a listán, minden ugrás 1-be kerül, ha "1"-es mezőre ugrunk,
    // akkor összesen 3-ba.
    for (int i = k; i < numbers.size(); i += k) {
      e -= 1;
      if (numbers.get(i) == 1) {
        e -= 2;
      }
    }
    return e;
  }
}
