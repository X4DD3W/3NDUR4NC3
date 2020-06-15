package hackerrank.problemsolving.nincskesz;

public class SaveThePrisonerNINCSKESZ {

  public static void main(String[] args) {
    System.out.println(saveThePrisoner(3, 7, 3));
    System.out.println(saveThePrisoner(4, 10, 2));
    System.out.println(saveThePrisoner(126, 859530642, 126));
    System.out.println(saveThePrisoner(46934, 543563655, 46743));
  }

  static int saveThePrisoner(int n, int m, int s) {
    // kiábrándítóan egyszerű :(
    return (m + s - 2) % n + 1;
  }
}
