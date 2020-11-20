package temp;

import java.time.LocalTime;

public class LeftPadder {

  public static void main(String[] args) {
    String valami = "0000";
    String leftPad = String.format("%1$" + 4 + "s", valami).replace(' ', '0');
    String result = new StringBuilder(leftPad).insert(2, ":").toString();
    System.out.println(result);
    LocalTime localTime = LocalTime.parse(result);

    System.out.println(localTime);
    LocalTime newTime = localTime.minusMinutes(30);
    System.out.println("New localtime:" + newTime);
  }

}
