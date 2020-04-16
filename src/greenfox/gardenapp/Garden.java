package greenfox.gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> garden = new ArrayList<>();

  Garden(){
  }

  public List<Plant> findThirstyPlants() {
    List<Plant> listOfThirstyPlants = new ArrayList<>();
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needsWater()) {
        listOfThirstyPlants.add(garden.get(i));
      }
    }
    return listOfThirstyPlants;
  }

  public void watering(double waterAmount) {
    List<Plant> saveList = findThirstyPlants();
    double portion = waterAmount / saveList.size();
    for (int i = 0; i < saveList.size(); i++) {
      saveList.get(i).absorbing(portion);
    }
    System.out.println("Watering with " + (int) waterAmount);
  }

  public void status() {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needsWater()) {
        System.out.println("The " + garden.get(i).getName() + " " + garden.get(i).getType() + " needs water.");
      } else {
        System.out.println("The " + garden.get(i).getName() + " " + garden.get(i).getType() + " doesn't need water.");
      }
    }
  }

}
