package hackerrank.problemsolving;

public class ChocolateFeast {

  public static void main(String[] args) {
    System.out.println(chocolateFeast(6, 2, 2));  // 5
    System.out.println(chocolateFeast(10, 2, 5)); // 6
    System.out.println(chocolateFeast(12, 4, 4)); // 3
    // n: pénz
    // c: csoki ára
    // m: ennyi csomagolás után kapsz +1 csokit
  }

  static int chocolateFeast(int n, int c, int m) {
    int result = 0;
    int choc = n / c;

    if (choc == m) {
      return choc + 1;
    }

    if (choc < m) {
      return choc;
    } else {
      int wrappers = choc;
      while (wrappers >= m) {
        // megeszem mind a 3mat, +3 wrapper
        result += choc;
        // 3w / 2m = 1 csoki (+1 wrapper) és maradt 1 wrapper
        choc = wrappers / m;
        wrappers = wrappers % m + choc;
      }
      if (choc != 0) {
        result += choc;
      }
    }

    return result;
  }

}
