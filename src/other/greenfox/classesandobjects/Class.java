package other.greenfox.classesandobjects;

public class Class {

  public String publikus = "Minden classból és instance-ból elérhető";
  private String privat = "Csak setterrel lehet rajta módosítani.";
  final String vegleges = "Nem lehet rajta módosítani a subclassokban.";

  private static void statikusMethod() {
    System.out.println("A statikus method csak az adott classban hívható meg, azt hiszem.");
  }

  public static void main(String[] args) {

    statikusMethod();

  }

}
