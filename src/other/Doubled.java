package other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String filename = "duplicated-chars-original.txt";
    decryptor(filename);

  }

  public static ArrayList decryptor(String filename) {
    List<String> lines = new ArrayList<>();
    try {
      Path filepath = Paths.get(filename);
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("Unable to read the file.");
    }
    String decryptedTemp = "";
    List<String> decryptedFile = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      for (int j = 0; j < lines.get(i).length(); j += 2) {
        decryptedTemp = decryptedTemp + lines.get(i).charAt(j);
      }
      decryptedFile.add(decryptedTemp);
      decryptedTemp = "";
    }
    return (ArrayList) decryptedFile;
  }

}