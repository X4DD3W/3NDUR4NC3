package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetI {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String[] pair_left = new String[t];
    String[] pair_right = new String[t];

    for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
    }

    HashSet<String> result = new HashSet<>(t);
    for (int i = 0; i < t; i++) {
      String temp = pair_left[i] + " " + pair_right[i];
      result.add(temp);
      System.out.println(result.size());
    }
  }
}
