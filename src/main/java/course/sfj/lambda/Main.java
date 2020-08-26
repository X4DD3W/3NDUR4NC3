package course.sfj.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    // lambda expression
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Vivi", "Laci", "Kira"));
    System.out.println("Mutasd a neveket:");
    names.forEach(name -> System.out.println(name));
    // names.forEach(System.out::println);

    ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(
        new Dog("Kili", 12),
        new Dog("Yoda", 10),
        new Dog("Sátán", 42)));

    System.out.println("Most mutasd a kutyukat:");
    dogs.forEach(System.out::println);

    System.out.println("Sortold őket (age szerint):");
    // Collections.sort(dogs);
    dogs.sort((d1, d2) -> d1.getAge() - d2.getAge());
    dogs.forEach(System.out::println);

    System.out.println("Sortold őket name szerint:");
    dogs.sort(Dog.nameComparator);
    dogs.forEach(System.out::println);
    System.out.println("-----------------------------");

    // Classic
    Program program = new Program();
    Dog dog = new Dog("Yoda", 10);
    program.doSomething(dog);

    // Lambda
    Growl growling = () -> {
      System.out.println("Grrrrrrrrr w lambda!");
    };
    program.doSomething(growling);

    // Ha egy sor a kód, el lehet hagyni a {}-et:
    Growl growling2 = () -> System.out.println("Grrrrrrrrrr w shorter lambda!");
    program.doSomething(growling2);

    // További példa (lambda vs InnerClass)
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Futooook!");
      }
    });

    Thread t2 = new Thread(() -> System.out.println("Futifutiiiii!"));
  }
}
