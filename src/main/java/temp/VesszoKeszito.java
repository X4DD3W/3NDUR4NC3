package temp;

public class VesszoKeszito {

  public static void main(String[] args) {
    System.out.println(vesszoKeszito("95 95 95 33 95 95 33 33 33 95 33 95 95 95 95 95 95 95 95 95 95 95 95 33 33 95 95 95 95 33 33 33 95 33 33 33 33 33 95 95 95 95 95 33"));
  }

  static String vesszoKeszito(String input) {
    return input.replaceAll(" ", ", ");
  }
}
