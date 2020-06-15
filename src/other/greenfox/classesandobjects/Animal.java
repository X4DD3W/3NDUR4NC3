package other.greenfox.classesandobjects;

public class Animal {

  private int hunger;
  private int thirst;

  Animal(){
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

}
