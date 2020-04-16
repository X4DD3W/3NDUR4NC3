package greenfox.zoo;

public class Zoo {

  public static void main(String[] args) {
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("How do you breed?");
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
  }
}
