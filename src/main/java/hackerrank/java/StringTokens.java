package hackerrank.java;

public class StringTokens {

  public static void main(String[] args) {
    tokenCreator("Egy meg egy, az kettő, mondat? Kérdőjel!");
    tokenCreator("          ");
    tokenCreator("    YES    leading spaces     are valid,    problemsetters are     evillll");
    tokenCreator(",_! ! _@?'_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?, !.? @@@@!!?'  ',',.");
  }

  private static void tokenCreator(String s) {
    String temp = s.trim();
    String[] array = temp.split("[ !,?._'@]+");
    if (array.length == 0 || array[0].equals("")) {
      System.out.println(0);
    } else {
      System.out.println(array.length);
    }
    for (String value : array) {
      System.out.println(value);
    }
  }
}
