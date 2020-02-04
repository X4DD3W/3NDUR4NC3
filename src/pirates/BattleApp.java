package pirates;

public class BattleApp {

  public static void main(String[] args) {

    /*Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();

    pirate1.drinkSomeRum();
    pirate1.howsItGoingMate();
    pirate1.brawl(pirate2);

    Ship ship1 = new Ship();
    Ship ship2 = new Ship();

    ship1.fillShip();
    ship2.fillShip();

    ship1.battle(ship2);
    ship1.shipStatus();
    ship2.shipStatus();*/

    Armada firstArmada = new Armada();
    firstArmada.fillArmada();
    Armada secondArmada = new Armada();
    secondArmada.fillArmada();

    System.out.println(firstArmada.war(secondArmada));
  }
}
