package greenfox.pirates;

import java.util.Random;

public class Pirate {

  private int drunkenRum = 0;
  private boolean isAlive = true;
  private boolean passedOut = false;
  private Random luck = new Random();

  Pirate() {
  }

  public void drinkSomeRum() {
    drunkenRum++;
  }

  public void howsItGoingMate() {
    if (drunkenRum > 4) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOut();
    } else {
      System.out.println("Pour me anudder!");
    }
  }

  public void passOut() {
    drunkenRum = 0;
    passedOut = true;
    System.out.println("The pirate is passed out.");
  }

  public void die() {
    isAlive = false;
  }

  public void brawl(Pirate otherPirate) {
    if (otherPirate.isAlive) {
      int rng = luck.nextInt(3);
      switch (rng) {
        case 0:
          this.die();
          break;
        case 1:
          otherPirate.die();
          break;
        case 2:
          this.passOut();
          otherPirate.passOut();
          break;
      }
    }
  }

  public int getDrunkenRum() {
    return drunkenRum;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public boolean isPassedOut() {
    return passedOut;
  }

}
