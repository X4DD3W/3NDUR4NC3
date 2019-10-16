package interfaces;

public class Bird extends Vehicle implements Flyable {

  @Override
  public void fly() {
    System.out.println("Bird's fly() method executed.");
  }

}
