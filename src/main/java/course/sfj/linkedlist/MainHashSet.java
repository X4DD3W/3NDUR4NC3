package course.sfj.linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainHashSet {

  public static void main(String[] args) {
    String[] dwarves = {"Fili", "Kili", "Dwalin", "Balin", "Kili"};
    List<String> list1 = Arrays.asList(dwarves);
    System.out.println("list1: " + list1);

    Set<String> set = new HashSet<>(list1);
    System.out.println("set: " + set);

    // Megpróbálhatod, nem fog menni, lepattan a hashsetről
    set.add("Kili");
    System.out.println("set: " + set);

    // Ha fontos a hashset sorrendje:
    Set<String> set2 = new LinkedHashSet<>(list1);
    System.out.println("set2: " + set2);
  }
}
