package hackerrank.problemsolving.almostdone;

public class Encryption {

  public static void main(String[] args) {
    System.out.println(encryption("feed the dog"));
    // feedthedog:
    // fto
    // ehg
    // ee
    // dd
    System.out.println(
        encryption("if man was meant to stay on the ground god would have given us roots"));
    // imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
    //    ifmanwas
    //    meanttos
    //    tayonthe
    //    groundgo
    //    dwouldha
    //    vegivenu
    //    sroots
  }

  static String encryption(String s) {
    String input = s.replaceAll(" ", "");
    StringBuilder result = new StringBuilder();
    int gyok = input.length();
    double L = Math.sqrt(gyok);
    int row = (int) L;
    int columns = row + 1;

    if (row * columns < L) {
      row++;
    }

    // rakd bele 0, 4, 8, szóköz
    // rakd bele 1, 5, 9, szóköz
    // rakd bele 2, 6, 10 (nincs!) -> szóköz
    // rakd bele 3, 7, 11 (nincs!) -> szóköz
    for (int j = 0; j <= row; j++) {
      result.append(input.charAt(j));
      while (j + columns < input.length()) {
        result.append(input.charAt(j + columns));
        columns += columns;
      }
      columns = row + 1;
      result.append(" ");
    }
    return result.toString();
  }

}
