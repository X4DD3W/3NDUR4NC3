package course.udemy.buchalka.innerclasses;

public class Main {

  public static void main(String[] args) {
    Shelf shelf1 = new Shelf("Polc");
    Shelf.MyBook aBook = shelf1.new MyBook("Harry P 8.", "JKRowling");
  }
}
