package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class Beugrooo {

  public static void main(String[] args) {
    int[] test1 = new int[]{1, 2, 3, 4, 5, 7};
    int[] test2 = new int[]{1, 2, 6, 8, 3, 7, 10, 11};
    System.out.println(intersection(test1, test2)); // should return [1, 2, 3, 7]
  }

  private static List<Integer> intersection(int[] array1, int[] array2) {
    List<Integer> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    for (int i : array2) {
      temp.add(i);
    }

    for (int j : array1) {
      if (temp.contains(j)) {
        result.add(j);
      }
    }
    return result;
  }
}

// algorithm komplexitás (pl intejrún)
// funkcionális, ne mfnckionális tesztek (stresszteszt pl)
// syntax error
// kompozíció (classok között), asszociatív kapcs
// abstract példányosítás
// 8080 az alap port

// unit/integration
// layerek + dependency injection
// implementation + interface
// abstract
