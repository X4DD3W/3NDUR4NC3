package hackerrank.problemsolving.almostdone;

public class RansomNote {

  public static void main(String[] args) {
    String[] magazine1 = {"give", "me", "one", "grand", "today", "night"};
    String[] magazine2 = {"give", "one", "grand", "today"};
    String[] note1 = {"two", "times", "three", "is", "not", "four"};
    String[] note2 = {"two", "times", "two", "is", "four"};

    checkMagazine(magazine1, note1);  // Yes
    checkMagazine(magazine2, note2);  // No - a "two" szó csak egyszer szerepel
  }

  static void checkMagazine(String[] magazine, String[] note) {

  }
}
