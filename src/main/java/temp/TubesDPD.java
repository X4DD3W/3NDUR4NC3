package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TubesDPD {

  public static void main(String[] args) {
    System.out.println(longestPipeSystemCounter(10));
    System.out.println(longestPipeSystemCounter(500));
  }

  public static int longestPipeSystemCounter(int times) {
    List<Tube> tubes = new ArrayList<>();
    int fiu = 0;
    int result = 0;

    for (int i = 0; i < times; i++) {
      tubes.add(Tube.getRandomTube());
      if (tubes.get(i).getType().equals("fiu")) {
        fiu++;
      }
    }
    //System.out.println("Fiu: " + fiu);

    if (fiu <= times / 2) {
      result = fiu * 2;
    }

    int lany = tubes.size() - fiu;
    // System.out.println("Lany " + lany);
    if (lany <= times / 2) {
      result = lany * 2;
    }

    // tubes.forEach(tube -> System.out.print(tube.getType() + " "));
    //System.out.println();
    // System.out.println("A megfejtés: ");
    return result < times - 1 ? result + 1 : result;
  }

  public static int longestPipeSystemCounterSHORT(int times) {
    int fiu = 0;

    for (int i = 0; i < times; i++) {
      if (Tube.getRandomTube().getType().equals("fiu")) {
        fiu++;
      }
    }

    int result = (fiu <= times / 2) ? fiu * 2 : times - fiu;
    return result < times - 1 ? result + 1 : result;
  }

}

class Tube {

  private final String type;

  public Tube(String type) {
    this.type = type;
  }

  static Tube getRandomTube() {
    Random random = new Random();
    List<String> types = new ArrayList<>(Arrays.asList("fiu", "lany"));
    return new Tube(types.get(random.nextInt(types.size())));
  }

  public String getType() {
    return this.type;
  }

}
