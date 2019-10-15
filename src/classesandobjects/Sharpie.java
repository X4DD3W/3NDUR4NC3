package classesandobjects;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount;

  Sharpie() {
  }

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }

}
