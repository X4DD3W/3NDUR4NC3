package course.udemy.streams.lectures;

import course.udemy.streams.beans.Person;
import course.udemy.streams.mockdata.MockData;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class Lecture12 {

  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            () -> new ArrayList<String>(),
            (list, element) -> list.add(element),
            (list1, list2) -> list1.addAll(list2)
        );
    // .collect(Collectors.toList());
    emails.forEach(System.out::println);

    // Ha hagyom IntelliJ-t dolgozni:
    List<String> emails2 = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            ArrayList::new,
            ArrayList::add,
            ArrayList::addAll
        );
    System.out.println(emails2);
  }
}
