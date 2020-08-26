package course.sfj.thread;

class Tasker extends Thread {

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Mellékszál " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class MultiThreading {

  public static void main(String[] args) {
    Tasker run1 = new Tasker();
    run1.start();

    Tasker run2 = new Tasker();
    run2.start();
  }
}
