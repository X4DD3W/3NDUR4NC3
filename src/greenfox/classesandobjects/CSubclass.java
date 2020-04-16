package greenfox.classesandobjects;

abstract class CSubclass extends EgySubclass {
  // Vagy magának is abstractnak kell lennie, vagy override-olnia kell a superclassben
  // lévő abstract methodo(ka)t.

  @Override
  void absztakt() {
    System.out.println("CSubclass absztrakt() called.");
  }

  public static void main(String[] args) {

  }

}
