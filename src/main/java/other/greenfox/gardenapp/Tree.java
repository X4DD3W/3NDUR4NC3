package other.greenfox.gardenapp;

public class Tree extends Plant {

  Tree(String name) {
    super.setWaterAmount(0);
    super.setName(name);
    super.setType("Tree");
  }

  @Override
  boolean needsWater() {
    return getWaterAmount() < 10;
  }

  @Override
  public void absorbing(double getWater) {
    setWaterAmount(getWater * 0.4);
  }

}
