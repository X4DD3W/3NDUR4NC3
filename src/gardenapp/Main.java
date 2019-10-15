package gardenapp;

public class Main {

  public static void main(String[] args) {

    Garden kert = new Garden();
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    kert.garden.add(flower1);
    kert.garden.add(flower2);
    kert.garden.add(tree1);
    kert.garden.add(tree2);

    kert.status();
    kert.watering(40);
    kert.status();
    kert.watering(70);
    kert.status();

  }

}
