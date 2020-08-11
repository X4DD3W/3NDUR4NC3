package other.other;

public class Anagram {

  public static void main(String[] args) {
    String test1 = "indula";
    String test2 = "aludni";
    System.out.println(anagram(test1, test2));
  }

  private static boolean anagram(String first, String second) {
    String temp = "";
    char[] charArray = first.toCharArray();
    for (int i = charArray.length - 1; i >= 0; i--) {
      temp += (charArray[i]);
    }
    return temp.equals(second);
  }
}
