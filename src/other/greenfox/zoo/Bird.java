package other.greenfox.zoo;

public class Bird extends Animal {

  private int wingpsan;

  @Override
  String breed() {
    return "laying eggs";
  }

  public Bird(String name) {
    super(name);
  }

  public int getWingpsan() {
    return wingpsan;
  }

  public void setWingpsan(int wingpsan) {
    this.wingpsan = wingpsan;
  }
}
