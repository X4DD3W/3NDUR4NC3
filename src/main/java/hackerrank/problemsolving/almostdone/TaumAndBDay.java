package hackerrank.problemsolving.almostdone;

public class TaumAndBDay {

  public static void main(String[] args) {
    System.out.println(taumBday(10, 10, 1, 1, 1));  // 20
    System.out.println(taumBday(7, 7, 4, 2, 1));  // 35
    System.out.println(taumBday(3, 3, 1, 9, 2));  // 12
    System.out.println(taumBday(5, 9, 2, 3, 4));  // 37
    System.out.println(taumBday(3, 6, 9, 1, 1));  // 12
    System.out.println(taumBday(384, 887, 2778, 6916, 7794)); // 7201244
    System.out.println(taumBday(336, 387, 493, 6650, 1422)); // 906753
  }

  public static long taumBday(int b, int w, int bc, int wc, int z) {
    if (bc > wc) {
      if (bc - wc > z) {
        bc = wc + z;
      }
    }
    if (wc > bc) {
      if (wc - bc > z) {
        wc = bc + z;
      }
    }
    return (long) b * bc + w * wc;
  }
}
