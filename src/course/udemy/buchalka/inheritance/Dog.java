package course.udemy.buchalka.inheritance;

public class Dog extends Animal {

  private int eyes;
  private int legs;

  public Dog(String name, int eyes, int legs) {
    super(name);
    this.eyes = eyes;
    this.legs = legs;
  }

  public void chew() {
    System.out.println("Dog.chew() called");
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() called");
    chew();
    super.eat();
  }
}
