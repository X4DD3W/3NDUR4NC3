package course.sfj.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Fis {

  public void readSingleChar() {
    try {
      FileInputStream fis = new FileInputStream("src\\resources\\message.txt");
      int i = fis.read(); // 86
      System.out.println((char) i); // "V"
      fis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
