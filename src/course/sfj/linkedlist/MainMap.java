package course.sfj.linkedlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainMap {

  public static void main(String[] args) {
    // ha számít a sorrend: LinkedHashMap<>();
    Map<String, Integer> testMap = new HashMap<>();
    testMap.put("Gyula", 21);
    testMap.put("Gizi", 27);
    testMap.put("Petya", 33);

    System.out.println(testMap);
    testMap.remove("Gizi");

    Iterator it = testMap.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry) it.next();
      System.out.println(pair.getKey() + " - " + pair.getValue());
    }
  }
}
