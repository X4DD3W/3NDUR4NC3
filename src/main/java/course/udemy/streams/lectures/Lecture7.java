package course.udemy.streams.lectures;

import course.udemy.streams.beans.Car;
import course.udemy.streams.mockdata.MockData;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import org.junit.Test;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    long countFemales = MockData.getPeople().stream()
        .filter(person -> person.getGender().equalsIgnoreCase("female"))
        .count();
    System.out.println(countFemales);
  }

  @Test
  public void min() throws Exception {
    double min = MockData.getCars().stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .min()
        .getAsDouble();
    //.orElse(0) mint default érték.
    System.out.println(min);
  }

  @Test
  public void max() throws Exception {
    double max = MockData.getCars().stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .max()
        .getAsDouble();
    //.orElse(0) mint default érték.
    System.out.println(max);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();
    double average = cars.stream()
        .mapToDouble(Car::getPrice)
        .average()
        .orElse(0);
    System.out.println(average);
  }

  @Test
  public void sum() throws Exception {
    double sum = MockData.getCars().stream()
        .mapToDouble(Car::getPrice)
        .sum();
    BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
    System.out.println(sum);
    System.out.println(bigDecimalSum);
  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics statistics = cars.stream()
        .mapToDouble(Car::getPrice)
        .summaryStatistics();
    System.out.println(statistics);
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getCount());
    System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());
    System.out.println(statistics.getSum());
  }
}
