package course.udemy.streams.lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import course.udemy.streams.beans.Car;
import course.udemy.streams.beans.Person;
import course.udemy.streams.beans.PersonDTO;
import course.udemy.streams.mockdata.MockData;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.junit.Test;

public class Lecture5 {

  final Predicate<Car> carPredicate = car -> car.getPrice() < 10000;

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    List<Car> carsFiltered = cars.stream()
        .filter(carPredicate)
        .collect(Collectors.toList());

    carsFiltered.forEach(System.out::println);
    System.out.println(carsFiltered.size());
  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> dtos = people.stream()
        // vagy a lenti Functiont kihelyezem változóba, mint carPredicate
        .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
        .collect(Collectors.toList());
    assertThat(dtos).hasSize(1000);
    System.out.println(dtos.size());
    // OR:
    List<PersonDTO> dtos2 = people.stream()
        .map(PersonDTO::map)  // előre megírt function a PersonDTO-ban!
        .collect(Collectors.toList());
    assertThat(dtos2).hasSize(1000);
    System.out.println(dtos2.size());
  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    double average = MockData.getCars().stream()
        .mapToDouble(Car::getPrice)
        .average()
        .orElse(0);
    System.out.println(average);
  }

  @Test
  public void test() throws Exception {

  }
}
