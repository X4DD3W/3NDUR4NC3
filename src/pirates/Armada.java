package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {

  private List<Ship> armada = new ArrayList<>();
  private Random random = new Random();

  public boolean war(Armada otherArmada) {
    int firstArmadaShipNo = 0;
    int secondArmadaShipNo = 0;
    boolean battleIsOn = true;
    boolean result = false;
    do {
      if (this.armada.get(firstArmadaShipNo)
          .battle(otherArmada.getArmada().get(secondArmadaShipNo))) {
        if (secondArmadaShipNo < otherArmada.getArmada().size()) {
          secondArmadaShipNo++;
        } else {
          result = true;
          break;
        }
      } else {
        if (firstArmadaShipNo < this.armada.size()) {
          firstArmadaShipNo++;
        } else {
          result = false;
          break;
        }
      }
    }
    while (battleIsOn);
    return result;
  }

  public Armada() {

  }

  public List<Ship> getArmada() {
    return armada;
  }

  public void fillArmada() {
    for (int i = 0; i < random.nextInt(500); i++) {
      armada.add(new Ship());
      armada.get(i).fillShip();
    }
  }
}
