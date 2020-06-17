package hackerrank.problemsolving.almostdone;

// TIMELIMIT
public class SherlockAndSquares {

  public static void main(String[] args) {
    System.out.println(squares(3, 9));
    System.out.println(squares(17, 24));
  }

  static int squares(int a, int b) {
    int counter = 0;
    for (double i = a; i <= (double) b; i++) {
      if (Math.sqrt(i) % 2.0 == 0.0 || Math.sqrt(i) % 2.0 == 1.0) {
        counter++;
      }
    }
    return counter;
  }
}
