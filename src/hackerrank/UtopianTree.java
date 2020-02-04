package hackerrank;

public class UtopianTree {

  static int utopianTree(int n) {
    int sizeOfTree = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sizeOfTree++;
      } else {
        sizeOfTree *= 2;
      }
    }
    return sizeOfTree;
  }
}
