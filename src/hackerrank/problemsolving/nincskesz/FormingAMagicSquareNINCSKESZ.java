package hackerrank.problemsolving.nincskesz;

public class FormingAMagicSquareNINCSKESZ {

  public static void main(String[] args) {
    int[][] test = new int[][]{
        {5, 3, 4},
        {1, 5, 8},
        {6, 4, 2}};
    formingMagicSquare(test);
  }

  // A sorok, oszlopok és átlók összegének mindig 15nek kell lennie
  // Egy szám csak egyszer szerepelhet a mátrixban/sorban
  static int formingMagicSquare(int[][] s) {

    return 0;
  }

  // Első sor, nincs kizárva duplikáció
    /*
    List<Integer> temp = new ArrayList<>();
    int sumOfRow = 0;

    for (int i = 0; i < s.length; i++) {
      temp.add(s[0][i]);
      sumOfRow += s[0][i];
      if (temp.size() == 3) {
        while (sumOfRow != 15) {
          if (temp.get(0) < 9) {
            temp.set(0, temp.get(0) + 1);
            sumOfRow++;
          } else if (temp.get(1) < 9) {
            temp.set(1, temp.get(1) + 1);
            sumOfRow++;
          } else if (temp.get(2) < 9) {
            temp.set(2, temp.get(2) + 1);
            sumOfRow++;
          }
        }
      }
    }*/

  // Második verzió
    /*int firstRow = 0;
    int secondRow = 0;
    int thirdRow = 0;
    int firstColumn = 0;
    int secondColumn = 0;
    int thirdColumn = 0;
    int rightDiagonal = 0;
    int leftDiagonal = 0;
    List<Integer> numbersOfMatrixSums = new ArrayList<>();*/

   /* for (int i = 0; i < s.length; i++) {
      firstRow += s[0][i];
      secondRow += s[1][i];
      thirdRow += s[2][i];
      firstColumn += s[i][0];
      secondColumn += s[i][1];
      thirdColumn += s[i][2];
      rightDiagonal += s[i][i];
      leftDiagonal += s[i][s.length - 1 - i];
    }

    numbersOfMatrixSums.add(firstRow);
    numbersOfMatrixSums.add(secondRow);
    numbersOfMatrixSums.add(thirdRow);
    numbersOfMatrixSums.add(firstColumn);
    numbersOfMatrixSums.add(secondColumn);
    numbersOfMatrixSums.add(thirdColumn);
    numbersOfMatrixSums.add(rightDiagonal);
    numbersOfMatrixSums.add(leftDiagonal);

    return 0;*/
}
