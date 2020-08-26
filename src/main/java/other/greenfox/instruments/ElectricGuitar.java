package other.greenfox.instruments;

public class ElectricGuitar extends StringedInstrument {

  ElectricGuitar() {
    super.setName("Electric Guitar");
    super.setNumberOfStrings(6);
  }

  ElectricGuitar(int numberOfStrings) {
    super.setName("Electric Guitar");
    super.setNumberOfStrings(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes Twang" );
  }
}
