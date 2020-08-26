package course.sfj.thread;

import java.util.Scanner;

class TaskerThree extends Thread {

  // volatile: ha a JVM cache-elné a runner értékét
  // ez jelzi, hogy "belekontárkodhatsz" a runner értékébe
  // volatile = nem cache-elhető
  private volatile boolean runner = true;

  public void run() {
    while (runner) {
      System.out.println("Futok");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void kill() {
    this.runner = false;
  }
}

public class VolatileDemo {

  // Elindul a "main" szál
  public static void main(String[] args) {
    TaskerThree one = new TaskerThree();
    // elindul a másik szál
    one.start();

    // a "main" szál itt megáll, amíg ENTER-t nem nyomunk
    System.out.println("Nyomj entert a szüneteltetéshez.");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    // ENTER-t nyomtak, "main" szál továbbmegy, leállítja a másik szálat
    one.kill();
  }
}
