package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> crew = new ArrayList<>();
  private Random random = new Random();
  Pirate captain;

  Ship() {
  }

  public void fillShip() {
    for (int i = 0; i < random.nextInt(50); i++) {
      crew.add(new Pirate());
    }
    crew.add(captain = new Pirate());
  }

  public int alivePirates() {
    int numberOfAlivePirates;
    if (captain.isAlive()) {
      numberOfAlivePirates = 1;
    } else {
      numberOfAlivePirates = 0;
    }
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isAlive()) {
        numberOfAlivePirates++;
      }
    }
    return numberOfAlivePirates;
  }

  public void shipStatus() {
    if (this.captain.isAlive()) {
      System.out.println("The captain consumed " + this.captain.getDrunkenRum()
          + " rum(s), and he is alive.\nNumber of alive pirates int the crew: " + alivePirates());
    } else if (this.captain.isPassedOut()) {
      System.out.println("The captain consumed " + this.captain.getDrunkenRum()
          + " rum(s), and he is passed out.\nNumber of alive pirates int the crew: "
          + alivePirates());
    } else {
      System.out.println("The captain consumed " + this.captain.getDrunkenRum()
          + " rum(s), and he is dead.\nNumber of alive pirates int the crew: " + alivePirates());
    }
  }

  public int shipScore() {
    return alivePirates() - this.captain.getDrunkenRum();
  }

  public boolean battle(Ship otherShip) {
    if (this.shipScore() > otherShip.shipScore()) {
      this.party();
      otherShip.randomLosses();
      return true;
    } else {
      this.randomLosses();
      otherShip.party();
      return false;
    }

  }

  public void party() {
    int randomNumberOfRums = random.nextInt(crew.size());
    captain.drinkSomeRum();
    for (int i = 0; i < randomNumberOfRums; i++) {
      crew.get(i).drinkSomeRum();
    }
  }

  public void randomLosses() {
    int randomNumberOfDeaths = random.nextInt(crew.size());
    for (int i = 0; i < randomNumberOfDeaths; i++) {
      crew.get(i).die();
    }
  }

}
