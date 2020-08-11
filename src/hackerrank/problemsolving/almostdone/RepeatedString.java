package hackerrank.problemsolving.almostdone;

public class RepeatedString {

  public static void main(String[] args) {
    System.out.println(repeatedString("aba", 10)); // 7, mert "abaabaabaa" (7db "a")
    System.out.println(repeatedString("balalajka", 997));  // 443
    System.out.println(repeatedString(
        "aedbdaeaddadddcedcbbabdccbecaecaccdbebeeadadcaabbaabbaeeeecaddbcdecbbdccdebaaebecdaaabbcdeccbabaabce",
        731869010806L));  // 168329872486
    System.out.println(repeatedString("a", 1000000000000L));
  }

  static long repeatedString(String s, long n) {
    if (!s.contains("a")) return 0;
    if (s.equals("a")) return n;

    long mennyiszerFerKiASzo = n / s.length();
    long maradek = n % s.length();

    if (s.length() > n) {
      return aSzamlalo(s, maradek);
    } else {
      return (mennyiszerFerKiASzo * aSzamlalo(s, s.length())) + aSzamlalo(s, maradek);
    }
  }

  private static long aSzamlalo(String s, long end) {
    int a = 0;
    for (int i = 0; i < end; i++) {
      if (s.charAt(i) == 'a') {
        a++;
      }
    }
    return a;
  }
  // region MŰKÖDIK, DE LASSÚ

  static long repeatedStringOld(String s, long n) {
    char[] array = s.toCharArray();
    long result = 0;
    int counter = 0;
    for (int i = 0; i < n; i++) {
      if (array[counter] == 'a') {
        result++;
      }
      if (counter < array.length - 1) {
        counter++;
      } else {
        counter = 0;
      }
    }
    return result;
  }

  // endregion
}