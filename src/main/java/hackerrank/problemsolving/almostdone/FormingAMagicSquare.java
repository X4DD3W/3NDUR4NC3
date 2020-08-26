package hackerrank.problemsolving.almostdone;

public class FormingAMagicSquare {

  public static void main(String[] args) {
    int[][] test = new int[][]{
        {5, 3, 4},  // 5 -> 8
        {1, 5, 8},  // 8 -> 9
        {6, 4, 2}}; // 4 -> 7
    System.out.println(formingMagicSquare(test)); // 7
    int[][] test2 = new int[][]{
        {4, 9, 2},
        {3, 5, 7},
        {8, 1, 5}};  // 5 -> 6
    System.out.println(formingMagicSquare(test2));  // 1
    int[][] test3 = new int[][]{
        {4, 8, 2},  // 8 -> 9
        {4, 5, 7},  // 4 -> 3
        {6, 1, 6}}; // (1)6 -> 8
    System.out.println(formingMagicSquare(test3));  // 4
  }

  // sorok, oszlopok, átlók összege mindig 15 kell, hogy legyen
  // a középső szám mindig az 5-ös
  // párok mindig: 1-9, 2-8, 3-7 és 4-6
  // végső sum mindig: 45

  // 00 22
  // 01 21
  // 02 20
  // 10 12
  // 11 11 (ekkor állj le!)

  // ij s.length s[i].length

  // a: 0 0 0 1
  // b: 0 1 2 0
  // c: 2 2 2 1
  // d: 2 1 0 2

  static int formingMagicSquare(int[][] s) {


    return 0;
  }























  /*static int formingMagicSquareOLD(int[][] s) {
    int sum = 0;

    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length; j++) {
        // if 00 párja 22-nek, tovább, else változtasd annyival, hogy az legyen
        if (fifteenChecker(s[i]) == 15) {
          break;
        }
        if (!valueChecker(s[i][j], s[s.length - 1 - i][s[i].length - 1 - j])) {
          if (i == 1 && j == 1) {
          } else if (numberIsDuplicated(s, s[i][j])) {
            sum += corrector(s[i][j], s[s.length - 1 - i][s[i].length - 1 - j]);
            s[i][j] += corrector(s[i][j], s[s.length - 1 - i][s[i].length - 1 - j]);
          }
        }
      }
    }
    return sum;
  }*/

  /*private static boolean numberIsDuplicated(int[][] s, int x) {
    List<Integer> tempList = new ArrayList<>();
    List<Integer> duplicated = new ArrayList<>();
    for (int[] ints : s) {
      for (int n : ints) {
        if (tempList.contains(n)) {
          duplicated.add(n);
        }
        tempList.add(n);
      }
    }
    return duplicated.contains(x);
  }*/

  private static int corrector(int x, int y) {
    return Math.abs(x - (10 - y));
  }

  private static boolean valueChecker(int a, int b) {
    return a == 1 && b == 9 || a == 9 && b == 1 ||
        a == 2 && b == 8 || a == 8 && b == 2 ||
        a == 3 && b == 7 || a == 7 && b == 3 ||
        a == 4 && b == 6 || a == 6 && b == 4;
  }

  private static int fifteenChecker(int[] s) {
    int tempRow = 0;
    for (int i = 0; i < s.length; i++) {
      tempRow += s[i];
    }
    return tempRow;
  }

}
