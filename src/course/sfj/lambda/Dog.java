package course.sfj.lambda;

import java.util.Comparator;

// Ha szükség lesz később valamelyik fieldje szerint sorbarendezni, Comparable kell
public class Dog implements Growl, Comparable {

  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void growling() {
    System.out.println("Grrr!");
  }

  @Override
  public String toString() {
    return name + ", " + age;
  }

  // Age szerinti sortolás Comparable implementálásával
  @Override
  public int compareTo(Object o) {
    int compareAge = ((Dog) o).getAge();
    // növekvő:   age - compareAge
    // csökkenő:  compareAge - age
    return this.age - compareAge;
  }

  public static Comparator<Dog> nameComparator = new Comparator<Dog>() {
    @Override
    public int compare(Dog o1, Dog o2) {
      String d1 = o1.getName();
      String d2 = o2.getName();
      return d1.compareTo(d2);
    }};
}
