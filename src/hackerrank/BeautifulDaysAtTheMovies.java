package hackerrank;

public class BeautifulDaysAtTheMovies {

  public static void main(String[] args) {
    int i = 20;
    int j = 23;
    int k = 6;
    System.out.println(beautifulDays(i, j, k));
  }

  static int beautifulDays(int i, int j, int k) {
    int counter = 0;
    for (int a = i; a <= j; a++) {
      String reversedChars = "";
      int reversedNumber = 0;
      char[] chars = String.valueOf(a).toCharArray();
      for (int b = chars.length - 1; b >= 0; b--) {
        reversedChars += String.valueOf(chars[b]);
      }
      reversedNumber = Integer.parseInt(reversedChars);
      if ((a - reversedNumber) % k == 0) {
        counter++;
      }
    }
    return counter;
  }
}
