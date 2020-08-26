package hackerrank.problemsolving;

public class CatsAndAMouse {

  static String catAndMouse(int x, int y, int z) {
    String result = "";
    if (Math.abs(z - x) == Math.abs(z - y)) {
      result = "Mouse C";
    } else if (Math.abs(z - x) < Math.abs(z - y)) {
      result = "Cat A";
    } else if (Math.abs(z - y) < Math.abs(z - x)) {
      result = "Cat B";
    }
    return result;
  }
}
