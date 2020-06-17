package course.udemy.buchalka.javagenerics;

import java.util.ArrayList;

// eredetileg: Team
public class Team<T extends Player> {

  private String name;
  // eredetileg ArrayList<Player>
  private ArrayList<T> players = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  // eredetileg addPlayer(Player player)
  public void addPlayer(T player) {
    if (players.contains(player)) {
      System.out.println(player.getName() + " is already on this team.");
    } else {
      players.add(player);
      System.out.println(player.getName() + " has added to " + this.name + ".");
    }
  }

  public int numPlayers() {
    return this.players.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
