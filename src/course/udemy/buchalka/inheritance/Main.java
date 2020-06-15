package course.udemy.buchalka.inheritance;

public class Main {

  public static void main(String[] args) {
    // Animal animal = new Animal("Állat");
    Dog dog = new Dog("Kili", 2, 4);
    Dog dog2 = new Dog("NewName", 2, 4);
    dog.eat();
    // mert static a "name"
    System.out.println(dog.getName());
    System.out.println(dog2.getName());
  }
}
