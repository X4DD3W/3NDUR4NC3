package hackerrank;

public class DrawingBook {

  static int pageCount(int n, int p) {
    if (p == 1 || n == p || ((n % 2 != 0) && (n - 1) == p)) {
      return 0;
    }
    if ((n - 1) == p) {
      return 1;
    }
    int counter = 0;
    if (n / 2 >= p) {
      for (int i = 1; i < p; i += 2) {
        counter++;
      }
    } else {
      for (int i = n; i > (p + 1); i -= 2) {
        counter++;
      }
    }
    return counter;
  }
}
