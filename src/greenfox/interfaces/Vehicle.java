package greenfox.interfaces;

public abstract class Vehicle implements Flyable {

  @Override
  public void land() {
    System.out.println("Vehicle's land() method executed.");
  }

  @Override
  public void fly() {
    System.out.println("Vehicle's fly() method executed.");
  }

  @Override
  public void takeOff() {
    System.out.println("Vehicle's takeOff() method executed.");
  }
}
