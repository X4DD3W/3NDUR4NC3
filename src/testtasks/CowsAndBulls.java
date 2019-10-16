package testtasks;

import java.util.Scanner;

public class CowsAndBulls {

  // Create a class what is capable of playing exactly one game of Cows and Bulls (CAB).
  // The player have to guess a 4 digit number.
  // For every digit that the player guessed correctly in the correct place, they have a “cow”.
  // For every digit the player guessed correctly in the wrong place is a “bull.”
  // If the player types a number that does not exist, that guess will not have any result.
  //
  // If the number to be found is "7624" and the player types "7296", the result is: "1 cow, 2 bull".
  //
  // The CAB object should have a random 4 digit number, which is the goal to guess.
  // The CAB object should have a state where the game state is stored (playing, finished).
  // The CAB object should have a counter where it counts the guesses.
  // The CAB object should have a guess method, which returns a string of the guess result
  // All methods, including constructor should be tested

  public static void main(String[] args) {

    CowsAndBulls cab = new CowsAndBulls();
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int numToGuess = (int) (Math.random() * 9000) + 1000;

    while (!(numToGuess == guessedNumber)) {
      gameState();
      counter++;
      String tip = scanner.nextLine();
      cabMethod(tip);
    }

  }

  public static void cabMethod(String tip) {

  }

  public static void gameState() {

  }

}
