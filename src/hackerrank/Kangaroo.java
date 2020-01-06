package hackerrank;

public class Kangaroo {

  static String kangaroo(int x1, int v1, int x2, int v2) {
    String result = "NO";
    if (v1 < v2) {
      return result;
    }
    while ((x1 + v1) <= (x2 + v2)) {
      x1 += v1;
      x2 += v2;
    }
    if (x1 == x2) {
      result = "YES";
    }
    return result;
  }
}
