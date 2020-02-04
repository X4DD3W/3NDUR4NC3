package hackerrank;

public class SaveThePrisonerNINCSKESZ {

  public static void main(String[] args) {
    // System.out.println(saveThePrisoner(126, 859530642, 126));
    // System.out.println(saveThePrisoner(46934, 543563655, 46743));
    System.out.println(saveThePrisoner(3, 7, 3));
  }

  static int saveThePrisoner(int n, int m, int s) {
    // n = 7 rab
    // m = 19 candy
    // s = 2. rabtól indul (azzal kezdődik)
    // ered: 6
    // 1 2! 3 4 5 6 7
    // 1 2 3! (7)

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
    int counter = 0;
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
    return result;
  }
}
