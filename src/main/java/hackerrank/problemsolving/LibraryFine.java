package hackerrank.problemsolving;

public class LibraryFine {

  public static void main(String[] args) {
    System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));  // 45
    System.out.println(libraryFine(9, 7, 2015, 6, 6, 2015));  // 500
    System.out.println(libraryFine(9, 6, 2016, 6, 6, 2015));  // 10000
    System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));  // 0
  }

  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    if (y2 > y1) {
      return 0;
    }
    if (y2 == y1 && m2 > m1) {
      return 0;
    }
    if (y2 == y1 && m2 == m1 && d2 > d1) {
      return 0;
    }
    if (y1 == y2) {
      if (m1 == m2) {
        if (d1 == d2) {
          return 0;
        }
        return 15 * (d1 - d2);
      }
      return 500 * (m1 - m2);
    } else {
      return 10000;
    }
  }
}
