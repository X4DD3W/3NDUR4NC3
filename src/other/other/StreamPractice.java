package other.other;

import static java.lang.Character.isUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

  public static void main(String[] args) {

    // Egy órás videóból:
    // List<Person> people...

  /*
  List<String> names =
  people.stream()
    .filter(person -> person.getAge() > 18)
        // másik classban lévő getter segítségével "add meg nekem a személyt,
        // akinek az életkor-értéke nagyobb, mint 18
    .map(person -> person.getName())
        // add meg nekem e személy nevét (névértékét, ami egy String)
    .map(name -> name.toUpperCase())
        // fogd ezt a Stringet és alakítsd csupa nagybetűvé
    .collect(toList());
        // majd rakd bele egy gyűjteménybe (aminek names a neve, lásd a stream elejét)
  System.out.println(names);
   */

  /*
  A fenti kód néhány eleme "::" módszerrel:
      .map(Person::getName)     // a Person objectre meghívható getName alkalmazása
      .map(String::toUpperCase) // a String objectre meghívható toUpperCase alkalmazása
      .forEach(System.out::println);  // a System.out-ra meghívható println alkalmazása
   */

  /*
  SUMhoz pl.:
  (...)
  .reduce(0, (temp, age) -> temp + age));
    // ahol 0 a kezdő elem, temp a partial result

  Máshogy:
  (...)
  .reduce(0, Integer::sum));

  Máshogy:
  (...)
  .mapToInt(Person::getAge)
  .sum());

  MAX:
  .max((person1, person2) -> person1.getAge() > person2.getAge() ? 1 : -1));

  METHOD MEGHÍVÁSA (vagy bármilyen, objekthez tartozó method meghívása
  (...)
  .filter(ClassName::methodName)
  (...)

  ITERATE
  Stream.iterate(1, e -> e + 1).limit(10).forEach(System.out::println);
    // ahol 1 a kezdő elem,
    // limit az elemek maximális száma

   */

    // Exercise 1: Write a Stream Expression to get the even numbers from the following list:
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> result1 = numbers
        .stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(result1);

    // Exercise 2: Write a Stream Expression to get the squared value of the positive numbers:
    List<Integer> result2 = numbers
        .stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .collect(Collectors.toList());
    System.out.println(result2);

    // Exercise 3: Write a Stream Expression to find which number squared value is more then 20:
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> result3 = numbers3
        .stream()
        .filter(n -> (n * n) > 20)
        .collect(Collectors.toList());
    System.out.println(result3);

    // Exercise 4: get the average value of the odd numbers
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    Double result4 = numbers4
        .stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average().getAsDouble();
    System.out.println(result4);

    // Exercise 5: get the sum of the odd numbers in the following list
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    Integer result5 = numbers5
        .stream()
        .filter(n -> n % 2 != 0)
        .mapToInt((n) -> n)
        .sum();
    System.out.println(result5);

    // Exercise 6:
    String pelda = "Write a Stream Expression to Find the uppercase characters in a string!";
    List<Character> characters = pelda.codePoints()
        .mapToObj(s -> (char) s)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println(characters);

    Stream<Character> char2 = pelda.codePoints().mapToObj(c -> (char) c);
    Stream<Character> charStream = char2.filter(c -> isUpperCase(c));
    List<Character> result6 = charStream.collect(Collectors.toList());
    System.out.println(result6);

    // Exercise 7: find the strings which starts with a given letter(as parameter), in the following list.
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    List<String> citiesResult = cities.stream()
        .filter(n -> n.startsWith("N"))
        .collect(Collectors.toList());
    System.out.println(citiesResult);

    // Exercise 8: concatenate a Character list to a string
    List<Character> alma = Arrays.asList('A', 'L', 'M', 'A');
    String result8 = alma
        .stream()
        .map(c -> c.toString())
        .collect(Collectors.joining());
    System.out.println(result8);

    // Exercise 9: find the frequency of characters in a given string
    String givenString = "Hosszú?";
    long result9 = givenString.codePoints().count();
    System.out.println(result9);
    Map<Object, Long> result92 = givenString
        .codePoints()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(result92);
  }
}
