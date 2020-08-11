package other.other;

public class PalindromeBuilder {

  public static void main(String[] args) {
    String test = null;
    // System.out.println(create_palindrome(test));
  }

  public String create_palindrome(String input) {
    char[] charArray = input.toCharArray();
    StringBuilder inputBuilder = new StringBuilder(input);
    for (int i = charArray.length - 1; i >= 0; i--) {
      inputBuilder.append(charArray[i]);
    }
    input = inputBuilder.toString();
    return input;
  }
}
