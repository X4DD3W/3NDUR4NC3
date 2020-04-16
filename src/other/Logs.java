package other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.

    String filename = "logs.txt";
    uniqeIPAddress(filename);
    requestRatioPresenter(filename);

  }

  public static List<String> uniqeIPAddress(String filename) {
    List<String> webserverLog = new ArrayList<>();
    try {
      Path filepath = Paths.get(filename);
      webserverLog = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("Ooops!");
    }
    List<String> onlyIPs = new ArrayList<>();
    for (int i = 0; i < webserverLog.size(); i++) {
      onlyIPs.add(i, webserverLog.get(i).substring(27, 38));
    }
    List<String> onlyUniqueIPs = new ArrayList<>();
    for (int i = 0; i < onlyIPs.size(); i++) {
      for (int j = 0; j < onlyIPs.size(); j++) {
        if (!(onlyUniqueIPs.contains(onlyIPs.get(j)))) {
          onlyUniqueIPs.add(onlyIPs.get(j));
        }
      }
    }
    return onlyUniqueIPs;
  }

  public static void requestRatioPresenter(String filename) {
    List<String> webserverLog = new ArrayList<>();
    try {
      Path filepath = Paths.get(filename);
      webserverLog = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("Ooops!");
    }
    // Idáig a fenti method is ugyanaz
    List<String> onlyRequestTypes = new ArrayList<>();
    for (int i = 0; i < webserverLog.size(); i++) {
      onlyRequestTypes.add(i, webserverLog.get(i).substring(41, 45));
    }
    int getCounter = 0;
    int postCounter = 0;
    for (int i = 0; i < onlyRequestTypes.size(); i++) {
      if (onlyRequestTypes.get(i).equals("GET ")) {
        getCounter++;
      } else {
        postCounter++;
      }
    }
    System.out.println("Number of GET-requests: " + getCounter);
    System.out.println("Number of POST-requests: " + postCounter);
  }
}
