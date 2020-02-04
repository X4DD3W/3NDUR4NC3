package hackerrank;

public class ElectronicsShop {

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int max = 0;
    for (int keyboard : keyboards) {
      for (int drive : drives) {
        if (keyboard + drive > max && keyboard + drive <= b) {
          max = keyboard + drive;
        }
      }
    }
    if (max == 0) {
      return -1;
    }
    return max;
  }
}
