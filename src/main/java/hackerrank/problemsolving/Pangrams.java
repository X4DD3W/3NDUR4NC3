package hackerrank.problemsolving;

public class Pangrams {

  public static void main(String[] args) {
    System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));  // pangram
    System.out.println(pangrams("The quick brown fo jumps over the lazy dog")); // not pangram (x)
  }

  static String pangrams(String s) {
    String n = s.replaceAll(" ", "").toLowerCase();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    for (int i = 0; i < n.length(); i++) {
      if (alphabet.contains(String.valueOf(n.charAt(i)))) {
        alphabet = alphabet.replaceAll(String.valueOf(n.charAt(i)), "");
      }
      if (alphabet.isEmpty()) {
        return "pangram";
      }
    }
    return "not pangram";
  }

}
