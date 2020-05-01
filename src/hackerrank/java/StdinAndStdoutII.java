package hackerrank.java;

import java.util.Scanner;

public class StdinAndStdoutII {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Integer i = scan.nextInt();
    Double d = scan.nextDouble();
    String s = scan.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
