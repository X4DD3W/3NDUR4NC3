package course.sfj.thread;

class TaskerTwo implements Runnable {

  @Override
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

public class MultithreadingTwoWithRunnable {

  public static void main(String[] args) {
    Thread t1 = new Thread(new TaskerTwo());
    Thread t2 = new Thread(new TaskerTwo());
    Thread t3 = new Thread(new TaskerTwo());
    t1.start();
    t2.start();
    t3.start();
  }
}
