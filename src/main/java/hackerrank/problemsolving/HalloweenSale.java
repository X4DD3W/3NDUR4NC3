package hackerrank.problemsolving;

public class HalloweenSale {

  public static void main(String[] args) {
    System.out.println(howManyGames(20, 3, 6, 80)); // 6
    System.out.println(howManyGames(20, 3, 6, 85)); // 7
  }

  static int howManyGames(int p, int d, int m, int s) {
    if (s < p) {
      return 0;
    }

    int result = 0;
    int actualPrizeOfGame = p;

    while (s > 0 && s - actualPrizeOfGame >= 0) {
      if (s - actualPrizeOfGame >= 0) {
        s -= actualPrizeOfGame;
        result++;
      }
      if (actualPrizeOfGame - d < m) {
        actualPrizeOfGame = m;
      } else {
        actualPrizeOfGame -= d;
      }
    }

    return result;
  }

}
