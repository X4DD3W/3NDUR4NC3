package hackerrank.java;

import java.util.Scanner;

public class OutputFormatting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      int x = sc.nextInt();
      System.out.print(s1);
      for (int j = 0; j < 15 - s1.length(); j++) {
        System.out.print(" ");
      }
      if (x < 10) {
        System.out.println("00" + x);
      } else if (x < 100) {
        System.out.println("0" + x);
      } else if (x < 1000) {
        System.out.println(x);
      }
    }
    System.out.println("================================");
  }
}
