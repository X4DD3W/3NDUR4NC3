package hackerrank.problemsolving;

public class AppleAndOrange {

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int countApple = 0;
    int countOrange = 0;
    for (int apple : apples) {
      if (s <= (a + apple) && (a + apple) <= t) {
        countApple++;
      }
    }
    for (int orange : oranges) {
      if (s <= (b + orange) && (b + orange) <= t) {
        countOrange++;
      }
    }
    System.out.println(countApple);
    System.out.println(countOrange);
  }
}
