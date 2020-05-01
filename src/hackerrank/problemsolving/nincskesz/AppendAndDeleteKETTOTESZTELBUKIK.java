package hackerrank.problemsolving.nincskesz;

public class AppendAndDeleteKETTOTESZTELBUKIK {

  public static void main(String[] args) {
    System.out.println(appendAndDelete("aba", "aba", 7)); // Yes
    System.out.println(appendAndDelete("hackerhappy", "hackerrank/problemsolving", 9));  // Yes
    System.out.println(appendAndDelete("Laci", "Vivi", 7));  // No
    System.out.println(appendAndDelete("aaa", "a", 5));   // Yes
    System.out.println(appendAndDelete("abcdef", "fedcba", 15));  // Yes  // DE NO-t ad!
    System.out.println(appendAndDelete("abcd", "abcdert", 10));  // No
  }

  private static String appendAndDelete(String s, String t, int k) {
    String result = "No";
    int x = 0;
    int min = Math.min(s.length(), t.length());
    StringBuilder whatIsCommon = new StringBuilder();
    StringBuilder whatIsDifferent = new StringBuilder();

    for (int i = 0; i < min; i++) {
      if (s.charAt(i) == t.charAt(i) && whatIsDifferent.length() == 0) {
        whatIsCommon.append(s.charAt(i));
      } else {
        whatIsDifferent.append(t.charAt(i));
      }
    }

    if (whatIsDifferent.length() == 0 && t.length() > s.length()) {
      whatIsDifferent.append(t.substring(s.length()));
    }

    if (s.equals(t) && (k - 1 == (s.length() + t.length()))) {
      result = "Yes";
    }

    x += Math.abs(whatIsCommon.length() - s.length());
    x += whatIsDifferent.length();

    if (x == k || x < k) {
      result = "Yes";
    }

    if (whatIsDifferent.length() != 0) {
      if ((s.length() + whatIsDifferent.length()) < k &&
          k % (s.length() + whatIsDifferent.length()) != 0) {
        result = "No";
      }
    }
    return result;
  }
}
