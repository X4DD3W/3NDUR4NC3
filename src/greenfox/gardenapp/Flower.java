package greenfox.gardenapp;

public class Flower extends Plant {

  Flower(String name) {
    super.setWaterAmount(0);
    super.setName(name);
    super.setType("Flower");
  }

  @Override
  boolean needsWater() {
    return getWaterAmount() < 5;
  }

  @Override
  public void absorbing(double getWater) {
    setWaterAmount(getWater * 0.75);
  }

}
