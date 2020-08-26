package hackerrank.java;

import java.util.Scanner;

public class StaticInitalizerBlock {

  private static Scanner scanner = new Scanner(System.in);
  private static final int B = scanner.nextInt();
  private static final int H = scanner.nextInt();
  private static boolean flag = method();

  private static boolean method() {
    if (StaticInitalizerBlock.B <= 0 || StaticInitalizerBlock.H <= 0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }
}
