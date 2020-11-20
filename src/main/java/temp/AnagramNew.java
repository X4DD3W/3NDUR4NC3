package temp;

public class AnagramNew {

  public static void main(String[] args) {
    System.out.println(anagram("dog", "god"));
    System.out.println(anagram("zöld", "faszocska"));
  }

  static boolean anagram(String first, String second) {
    if (first.length() != second.length()) {
      return false;
    }

    boolean result = true;
    for (int i = 0; i < first.length(); i++) {
      if (!(first.charAt(i) == second.charAt(second.length() - 1 - i))) {
        result = false;
        break;
      }
    }
    return result;
  }
}
