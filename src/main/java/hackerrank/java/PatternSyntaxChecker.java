package hackerrank.java;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

  public static void main(String[] args) {
    patternSyntaxChecker("([A-Z])(.+)");
    patternSyntaxChecker("[AZ[a-z](a-z)");
    patternSyntaxChecker("batcatpat(nat");
  }

  private static void patternSyntaxChecker(String pattern) {
    try {
      Pattern.compile(pattern);
      System.out.println("Valid");
    } catch (PatternSyntaxException exception) {
      System.out.println("Invalid");
      System.err.println("Invalid!!!");
    }
  }
}
