package hackerrank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaIterator {

  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<>(Arrays.asList(12, "juj", "###", "Szia", "Vivi!"));
    func(myList);
  }

  static void func(ArrayList<Object> mylist) {
    Iterator<Object> it = mylist.iterator();
    while (it.hasNext()) {
      Object element = it.next();
      if (element.equals("###")) {
        it.forEachRemaining(System.out::println);
        break;
      }
    }
  }
}
