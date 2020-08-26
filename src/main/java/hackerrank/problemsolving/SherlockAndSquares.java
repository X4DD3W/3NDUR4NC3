package hackerrank.problemsolving;

public class SherlockAndSquares {

  public static void main(String[] args) {
    System.out.println(squares(3, 9));  // 2 (4, 9)
    System.out.println(squares(3, 17));  // 3 (4, 9, 16)
    System.out.println(squares(17, 24));  // 0
    System.out.println(squares(59, 999999922)); // 31615
  }

  static int squares(int a, int b) {
    int result = 0;
    int x = 1;

    while (x * x < a) {
      x++;
    }

    while (x * x <= b) {
      result++;
      x++;
    }

    return result;
    // Timelimit:
    // return (int) IntStream.rangeClosed(a, b)
    // .filter(n -> Math.sqrt(n) % 2.0 == 0.0 || Math.sqrt(n) % 2.0 == 1.0).count();
  }
}
