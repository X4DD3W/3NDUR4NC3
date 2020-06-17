package course.udemy.buchalka.abstractclasses;

public abstract class Bird extends Animal implements CanFly {

  public Bird(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(getName() + " is picking");
  }

  @Override
  public void breathe() {
    System.out.println("Breath!");
  }

  @Override
  public void fly() {
    System.out.println("FLY! (from interface)");
    System.out.println("Value of the field from canFly interface is: " + fieldName);
  }
}
