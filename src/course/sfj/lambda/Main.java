package course.sfj.lambda;

public class Main {

  public static void main(String[] args) {
    // Classic
    Program program = new Program();
    Dog dog = new Dog();
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
