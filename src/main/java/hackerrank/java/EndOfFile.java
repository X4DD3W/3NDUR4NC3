package hackerrank.java;

import java.util.Scanner;

public class EndOfFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String temp = scanner.nextLine();
    int counter = 1;
    while (temp != null) {
      System.out.println(counter + " " + temp);
      try {
        temp = scanner.nextLine();
      } catch (Exception e) {
        break;
      }
      counter++;
    }
    scanner.close();
  }
}
