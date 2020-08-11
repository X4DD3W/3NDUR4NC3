package hackerrank.problemsolving;

public class JumpingOnTheClouds {

  public static void main(String[] args) {
    //                      1     2  3     4
    int[] c1 = new int[]{0, 0, 1, 0, 0, 1, 0};  // 4
    //                         1  2     3
    int[] c2 = new int[]{0, 0, 0, 0, 1, 0};     // 3
    //                         1     2  3
    int[] c3 = new int[]{0, 0, 0, 1, 0, 0};     // 3
    System.out.println(jumpingOnClouds(c1));
    System.out.println(jumpingOnClouds(c2));
    System.out.println(jumpingOnClouds(c3));
  }

  static int jumpingOnClouds(int[] c) {
    int counter = 0;
    int j = 1;
    while (j < c.length) {
      // ha már csak egy mező van hátra, ugorj rá és vége
      if (j + 1 >= c.length) {
        counter++;
        break;
      }
      // ha "0 0", vagy "1 0", akkor 2-t ugorj
      if ((c[j] == 0 && c[j + 1] == 0) || (c[j] == 1 && c[j + 1] == 0)) {
        counter++;
        j += 2;
      } else {
        // ha "0 1", akkor 1-et ugorj
        counter++;
        j++;
      }
    }
    return counter;
  }
}