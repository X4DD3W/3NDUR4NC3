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
    String filename = "src\\resources\\duplicated-chars.txt";
    fileWriter(decryptor(filename), filename);
  }

  public static List<String> decryptor(String filename) {
    List<String> lines = new ArrayList<>();
    try {
      Path filepath = Paths.get(filename);
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("Unable to read the file.");
    }
    String decryptedTemp = "";
    List<String> decryptedFile = new ArrayList<>();
    for (String line : lines) {
      for (int j = 0; j < line.length(); j += 2) {
        decryptedTemp = decryptedTemp + line.charAt(j);
      }
      decryptedFile.add(decryptedTemp);
      decryptedTemp = "";
    }
    System.out.println("Decryption is done.");
    return decryptedFile;
  }

  public static void fileWriter(List<String> decryptedFile, String filename) {
    System.out.println("Writing the files...");
    try {
      Path filePath = Paths.get(filename);
      Files.write(filePath, decryptedFile);
    } catch (Exception e) {
      System.out.println("Could not write the file!");
    }
    System.out.println("Done!");
  }
}
