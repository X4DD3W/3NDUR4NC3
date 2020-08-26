package course.udemy.streams.lectures;

import course.udemy.streams.beans.Person;
import java.util.List;
import course.udemy.streams.mockdata.MockData;
import java.util.stream.IntStream;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    // 0-10
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    // 0-9
    IntStream.range(0, 10).forEach(System.out::println);
    // 0-10
    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size())
        .forEach(actual -> System.out.println(people.get(actual)));
  }

  @Test
  public void intStreamIterate() throws Exception {
    IntStream.iterate(0, operand -> operand + 1)
        .filter(number -> number % 2 == 0)
        .limit(20)
        .forEach(System.out::println);
  }
}
