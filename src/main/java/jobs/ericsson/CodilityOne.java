package jobs.ericsson;

public class CodilityOne {

  public static void main(String[] args) {
    System.out.println(solution(125));  // 100
    System.out.println(solution(1));  // 0
    System.out.println(solution(55553323)); // 50000000
  }

  public static int solution(int N) {
    if (N == 1) {
      return 0;
    }
    String number = Integer.toString(N);
    return (int) (Integer.parseInt(String.valueOf(number.charAt(0))) *
                Math.pow(10, Integer.toString(N).length() - 1));
  }
}
