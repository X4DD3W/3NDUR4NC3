package other.greenfox.instruments;

abstract class Instrument {

  private String name;

  abstract void play();

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
