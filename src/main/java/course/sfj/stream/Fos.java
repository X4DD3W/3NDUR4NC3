package course.sfj.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Fos {

  public void writeSingleChar() {
    try {
      FileOutputStream fos = new FileOutputStream("src\\resources\\message.txt");
      fos.write(86);  // "V"
      fos.flush();
      fos.close();
      System.out.println("Kész vagyok.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
