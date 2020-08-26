package hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String n = scanner.nextLine();
    System.out.println((new BigInteger(n).isProbablePrime(1)) ? "prime" : "not prime");

    // a lenti pl. egy ilyen számmal nem fog időben lefutni:
    // 2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983

    /*int x = Integer.parseInt(n);
    int s = 2;
    int m = 0;
    while (m < x || m != 0) {
      if (x == 0 || x == 1) {
        System.out.println("not prime");
        break;
      }
      if (x >= 2 && x == s) {
        System.out.println("prime");
        break;
      }
      m = x % s;
      if (m == 0 && m < x) {
        System.out.println("not prime");
        break;
      } else if (m == x) {
        System.out.println("prime");
        break;
      } else {
        s += 1;
      }
    }*/
    scanner.close();
  }
}
