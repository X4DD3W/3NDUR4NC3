package greenfox.gardenapp;

public abstract class Plant {

  private double waterAmount;
  private String name;
  private String type;

  Plant() {
  }

  abstract boolean needsWater();

  public void absorbing(double getWater) {
    waterAmount = getWater;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

}
