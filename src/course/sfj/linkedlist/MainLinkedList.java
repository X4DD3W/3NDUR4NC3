package course.sfj.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

// https://youtu.be/D2pfbebDiSE
public class MainLinkedList {

  public static void main(String[] args) {
    LinkedList<String> people = new LinkedList<>();
    people.add("Vivi");
    people.add("Laci");
    System.out.println(people);

    Iterator<String> it = people.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
