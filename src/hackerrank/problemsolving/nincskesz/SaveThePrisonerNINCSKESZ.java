package hackerrank.problemsolving.nincskesz;

public class SaveThePrisonerNINCSKESZ {

  public static void main(String[] args) {
    System.out.println(saveThePrisoner(3, 7, 3));
/*    System.out.println(saveThePrisoner(126, 859530642, 126));
    System.out.println(saveThePrisoner(46934, 543563655, 46743));
    System.out.println(saveThePrisoner(3, 7, 3));*/
  }

  static int saveThePrisoner(int n, int m, int s) {
    // Ha n == s? Ha n = m? Ha m = s?
    // n  m  s
    // 3  7  3  (3)
    // 4  10 2  (3)
    // 5  2  1  (2)
    // 5  2  2  (3)
    // 7  19 2  (6)

    return 0;


    /*int c;
    if ((n == s) && (m % n != 1)) {
      c = 0;
    } else if ((n == s) && (m % n == 1)) {
      c = 1;
    } else {
      c = s;
    }
    int maradek = Math.abs(m % n) - 1;
    return c + maradek;*/

   /* List<Integer> slaves = new ArrayList<>();
    for (int i = 1; i < s; i++) {
      slaves.add(i);
    }

    // int x = m % n; // 5
    int result = 0;

    if (n == s) {
      result = s + (m % n);
    } else {
      result = s + ((m % n) - 1);
    }
    return result;*/

    // jó, csak nem fut le időben



    /*int counter = 0;
    int result = s;

    while (counter != m) {
      counter++;
      if (n == s) {
        // result += (m % n);
        break;
      }
      if (counter == m) break;
      if (result == n) {
        result = 0;
      }
      result++;
    }
    return result;*/
  }
}
