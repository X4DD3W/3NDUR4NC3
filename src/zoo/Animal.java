package zoo;

public abstract class Animal {

  private String name;
  private int age;

  abstract String breed();

  public Animal() {

  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
