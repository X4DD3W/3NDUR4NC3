package greenfox.interfaces;

public class Main {

  public static void main(String[] args) {

    Bird bird = new Bird();

    Vehicle motor = new Vehicle() {
    };

    bird.fly();
    motor.land();
    motor.takeOff();
    motor.fly();

  }

}
