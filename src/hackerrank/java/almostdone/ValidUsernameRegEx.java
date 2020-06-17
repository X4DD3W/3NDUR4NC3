package hackerrank.java.almostdone;

import java.util.Scanner;

public class ValidUsernameRegEx {

  private static final Scanner scan = new Scanner(System.in);
  public static final String regularExpression = "";
  // a fenti Stringet kell átírni:
  // 8-30 character
  // alfanumerikus karaktereket [a-z][A-Z][0-9] és alulvonást (_) tartalmazhat
  // az első karakternek betűnek kell lennie (kis/nagy)

  public static void main(String[] args) {
    int n = Integer.parseInt(scan.nextLine());
    while (n-- != 0) {
      String userName = scan.nextLine();

      if (userName.matches(regularExpression)) {
        System.out.println("Valid");
      } else {
        System.out.println("Invalid");
      }
    }
  }
}
