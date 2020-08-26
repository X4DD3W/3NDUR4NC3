package course.udemy.buchalka.javagenerics;

public class Main {

  public static void main(String[] args) {

    FootballPlayer puskas = new FootballPlayer("Puskás");
    BasketballPlayer leBron = new BasketballPlayer("LeBron");

    Team<FootballPlayer> bostonFighters = new Team<>("Boston Fighters");
    bostonFighters.addPlayer(puskas);

    System.out.println("Size of the team is: " + bostonFighters.numPlayers());
  }
}
