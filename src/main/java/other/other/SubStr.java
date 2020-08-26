package other.other;

public class SubStr {
  public static void main(String[] args) {

    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one
    //  Example:
    //  should print: `17`
    // System.out.println(subStr("this is what I'm searching in", "searching"));
    //  should print: `-1`
    // System.out.println(subStr("this is what I'm searching in", "not"));

    String where = "Jaj ja jajaj jaj ja ja ja jajj ja jaj ja ja ja ja";
    String what = "ja";
    System.out.println(subStr(where, what));

  }

  public static int subStr(String input, String q) {
    return input.contains(q) ? input.indexOf(q) : -1;
  }
}