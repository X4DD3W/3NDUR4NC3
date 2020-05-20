package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTasks {

  // VARIABLES
  private static final List<String> strings = new ArrayList<>(Arrays.asList(
      "trollolo", "haha", "huhu", "apa", "anya", "aka", "ilyenek..."));

  public static void main(String[] args) {
    // TESTS
    System.out.println(toUpperCase(strings));
    System.out.println(searchWithFilter(strings));
  }

  // METHODS

  private static List<String> toUpperCase(List<String> list) {
    return list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  // Given a list of Strings, write a method that returns a list of all strings that start
  // with the letter 'a' (lower case) and have exactly 3 letters.
  private static List<String> searchWithFilter(List<String> list) {
    return list.stream()
        .filter(string -> string.startsWith("a"))
        .filter(string -> string.length() == 3)
        .collect(Collectors.toList());
  }

}
