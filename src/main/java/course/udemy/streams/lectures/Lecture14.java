package course.udemy.streams.lectures;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture14 {

  public List<String> upperCase(List<String> list) {
    return list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }
}
