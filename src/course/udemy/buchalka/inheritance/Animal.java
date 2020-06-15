package course.udemy.buchalka.inheritance;

public class Animal {

  private static String name;

  public Animal(String name) {
    Animal.name = name;
  }

  public void eat() {
    System.out.println("Animal.eat() called");
  }

  public void move() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    Animal.name = name;
  }
}
