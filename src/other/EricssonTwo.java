/*
import java.util.ArrayList;
import java.util.List;

public class EricssonTwo {

  public static void main(String[] args) {
    System.out.println(solution("vivi", "vivi"));
    System.out.println(solution("o", "odd"));
    System.out.println(solution("nice", "nicer"));

    System.out.println(solution("meet", "met"));
    System.out.println(solution("late", "tale"));

  }

  private static String solution(String s, String t) {
    // equality check (NOTHING)
    if (s.equals(t)) {
      return "NOTHING";
    }

    // length check (IMPOSSIBLE)
    if (Math.abs(s.length() - t.length()) > 1) {
      return "IMPOSSIBLE";
    }

    String result = "Something works wrong.";
    StringBuilder temp = new StringBuilder();
    List<Character> charactersOfActualString = new ArrayList<>();

    if (t.length() > s.length()) {
      // ADD
      StringBuilder tempT = new StringBuilder();
      for (int i = 0; i < t.length(); i++) {
        charactersOfActualString.add(t.charAt(i));
      }
      temp.append(t.charAt(t.length() - 1));
      charactersOfActualString.remove(charactersOfActualString.size() - 1);
      for (Character character : charactersOfActualString) {
        tempT.append(character);
      }
      if (s.contentEquals(tempT)) {
        return "ADD " + temp;
      }
    }

    if (s.length() > t.length()) {
      // JOIN
      // 0 1 2 3
      // m e e t
      // 0 1 - 3
      // m e   t

      if (t.contentEquals(tempS)) {
        return "JOIN " + temp;
      }
    }

    if (s.length() == t.length()) {
      // SWAP
      return "SWAP lenne";
    }
    return result;
  }
}
*/
