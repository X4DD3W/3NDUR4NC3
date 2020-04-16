package hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {

  public static void main(String[] args) {
    extraLongFactorials(25);
    // 15511210043330985984000000
  }

  private static void extraLongFactorials(int n) {
    BigInteger result = new BigInteger("1");
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    System.out.println(result);
  }
}
