import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeBuilderTest {

  private PalindromeBuilder palindromeBuilder;

  @Before
  public void setUp() throws Exception {
    palindromeBuilder = new PalindromeBuilder();
  }

  @Test(expected = NullPointerException.class)
  public void create_Palindrome_InputIsNull_Exception() {
    String test = null;
    palindromeBuilder.create_palindrome(test);
  }

  @Test
  public void create_Palindrome_InputIsEmpty_EmptyString() {
    String test = "";
    String result = palindromeBuilder.create_palindrome(test);
    assertEquals(result, test);
  }

  @Test
  public void create_Palindrome_InputIsOneCharacter_DoubleTheCharacter() {
    String test = "a";
    String result = palindromeBuilder.create_palindrome(test);
    assertEquals(result, "aa");
  }

  @Test
  public void create_Palindrome_InputIsTwoSPaceSeparatedWord_CreateThePalindrome() {
    String test = "alfa beta";
    String result = palindromeBuilder.create_palindrome(test);
    assertEquals(result, "alfa betaateb afla");
  }

  @Test
  public void create_Palindrome_InputContainsSpecialChar_CreateThePalindrome() {
    String test = "őáűú@_";
    String result = palindromeBuilder.create_palindrome(test);
    assertEquals(result, "őáűú@__@úűáő");
  }
}
