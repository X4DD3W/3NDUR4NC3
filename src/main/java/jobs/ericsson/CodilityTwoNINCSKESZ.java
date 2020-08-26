package jobs.ericsson;

public class CodilityTwoNINCSKESZ {

  public static void main(String[] args) {
    System.out.println(solution("BAAABAB"));  // 2 (AAABB)
    System.out.println(solution("BBABAA"));   // 3 (delete all A or B)
    System.out.println(solution("AABB"));   // 0 (így jó)
  }

  public static int solution(String S) {
    StringBuilder sb = new StringBuilder(S);
    int result = 0;
    int counter = 0;

    for (int i = 0; i < sb.length(); i++) {
      while (sb.charAt(counter) != 'A') {
        result++;
        counter++;
      }
    }

    return result;
  }
}
