package hackerrank.problemsolving;

public class FindDigits {

  public static void main(String[] args) {
    System.out.println(findDigits(1012));
  }

  private static int findDigits(int n) {
    char[] array = Integer.toString(n).toCharArray();
    int counter = 0;
    for (char c : array) {
      if ((Character.getNumericValue(c) != 0) && (n % Character.getNumericValue(c) == 0)) {
        counter++;
      }
    }
    return counter;
  }
}
