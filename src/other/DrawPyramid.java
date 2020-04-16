package other;

import java.util.Scanner;

public class DrawPyramid {

  public static void main(String[] args) {

    // region Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    // ___*   (3, 1)
    // __***  (2, 3)
    // _***** (1, 5)
    // *******(0, 7)
    // The pyramid should have as many lines as the number was
    // ____*    (4, 1)
    // ___***   (3, 3)
    // __*****  (2, 5)
    // _******* (1, 7)
    // *********(0, 9)
    // endregion

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter a number for the pyramid:");
    int size = scanner.nextInt();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
