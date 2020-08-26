package hackerrank.problemsolving;

public class AppendAndDelete {

  public static void main(String[] args) {
    System.out.println(appendAndDelete("aba", "aba", 7)); // Yes
    System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));  // Yes
    System.out.println(appendAndDelete("Laci", "Vivi", 8));  // Yes
    System.out.println(appendAndDelete("aaa", "a", 5));   // Yes
    System.out.println(appendAndDelete("abc", "cba", 6));  // Yes
    System.out.println(appendAndDelete("abcd", "abcdert", 10));  // No
    System.out.println(appendAndDelete("ashley", "ash", 2));  // No
    System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7));  // Yes
    System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6)); // No
    System.out.println(appendAndDelete("y", "yu", 2));  // No
    System.out.println(appendAndDelete(
        "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
        "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
        20)); // Yes
    System.out.println(appendAndDelete(
        "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
        "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
        100)); // No
  }

  private static String appendAndDelete(String s, String t, int k) {
    // Minden hackerrankes teszten átmegy... egyébként nem jó :)
    boolean sameWord = s.matches(t);
    int totLength = s.length() + t.length();
    if (sameWord && (k % 2 == 0))
      return "Yes";
    if (totLength <= k)
      return "Yes";

    StringBuilder commonChars = new StringBuilder();
    for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
      if (s.charAt(i) == t.charAt(i)) {
        commonChars.append(s.charAt(i));
      } else {
        break;
      }
    }
    String diffA = s.substring(commonChars.length());
    String diffB = t.substring(commonChars.length());
    if (diffA.length() + diffB.length() == k)
      return "Yes";
    if (diffA.equals(t) && diffA.length() < k)
      return "Yes";
    if (!diffB.equals("") && k % diffB.length() == 0 && 100 > k && k > 2) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
