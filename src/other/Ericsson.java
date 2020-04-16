package other;

import java.util.ArrayList;
import java.util.List;

public class Ericsson {

  public static void main(String[] args) {
    System.out.println(solution(268));
    System.out.println(solution(670));
    System.out.println(solution(0));
    System.out.println(solution(-999));
    System.out.println(solution(-8000));
    System.out.println(solution(8000));
  }

  public static int solution(int n) {
    char five = 5 + '0';
    String digits = String.valueOf(n);
    List<Character> characters = new ArrayList<>();

    for (int i = 0; i < digits.length(); i++) {
      characters.add(digits.charAt(i));
    }

    for (int i = 0; i < digits.length(); i++) {
      if (n < 0) {
        if (five < characters.get(i)) {
          characters.add(i, five);
          break;
        }
      }
      if (n == 0) {
        characters.add(0, five);
        break;
      }
      if (n > 0) {
        if (five > characters.get(i)) {
          characters.add(i, five);
          break;
        }
      }
    }

    StringBuilder temp = new StringBuilder();
    for (Character character : characters) {
      temp.append(character);
    }
    return Integer.parseInt(temp.toString());
  }
}
