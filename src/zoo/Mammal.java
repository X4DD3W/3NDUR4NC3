package zoo;

public class Mammal extends Animal {

  private String valami;

  @Override
  String breed() {
    return "pushing miniature versions out";
  }

  public Mammal(String name) {
    super(name);
  }

  public String getValami() {
    return valami;
  }

  public void setValami(String valami) {
    this.valami = valami;
  }
}
