package jobs.ash;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FelveteliFeladat {

  public static void main(String[] args) {

    // Adott egy string. Adja meg az algoritmust, amely megkeresi
    // az első nem ismétlődő karaktert a stringben és visszaadja a pozícióját.
    System.out.println(methodName("Ababc"));  // Ababc (A: 0)
    System.out.println(methodName("ababc"));  // ababc (c: 4)
    System.out.println(methodName("kereki")); // kereki (r: 2)
    System.out.println(methodName("aabbcc")); // aabbcc (???)

  }

  public static int methodName(String input) {
    LinkedHashMap<Character, Integer> charsAndOccurrences = new LinkedHashMap<>();
    HashMap<Character, Integer> charsAndPositions = new HashMap<>();
    char[] array = input.toCharArray();
    int counter = 0;

    // Feltölti a karakter-előfordulás LinkedHashMapet (előkerülési sorrendben)
    // Feltölti a karakter-pozíció HashMapet
    for (int i = 0; i < array.length; i++) {
      for (char value : array) {
        if (array[i] == value) {
          counter++;
        }
      }
      charsAndOccurrences.put(array[i], counter);
      charsAndPositions.put(array[i], i);
      counter = 0;
    }

    // Megkeresi az első 1-es értékű karaktert
    Character firstCharWithOneAppearance = null;
    for (Character c : charsAndOccurrences.keySet()) {
      if (charsAndOccurrences.get(c) == 1) {
        firstCharWithOneAppearance = c;
        break;
      }
    }

    // Kikeresi és visszaadja az első, 1-es előfordulású karakter helyét
    // Ha nincs ilyen, NullpointerException :)
    return charsAndPositions.get(firstCharWithOneAppearance);
  }
}
