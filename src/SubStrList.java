public class SubStrList {

  public static void main(String[] args) {
    //  Create a function that takes a string and a list of string as a parameter
    //  Returns the index of the string in the list where the first string is part of
    //  Only need to find the first occurence and return the index of that
    //  Returns `-1` if the string is not part any of the strings in the list

    //  Example
    String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", searchArr));
    //  should print: `4`
    System.out.println(subStrList("not", searchArr));
    //  should print: `-1`

  }

  public static int subStrList(String what, String[] array) {
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i].contains(what)) {
        result = i;
      }
    }
    if (result == 0) {
      return -1;
    } else {
      return result;
    }
  }

}