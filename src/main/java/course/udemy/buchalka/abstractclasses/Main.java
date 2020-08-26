package course.udemy.buchalka.abstractclasses;

public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog("Yoda");
    dog.breathe();
    dog.eat();

    Parrot parrot = new Parrot("Parrot");
    parrot.breathe();
    parrot.eat();
    parrot.fly();

    Penguin penguin = new Penguin("Pingvin");
    penguin.fly();
  }
}
