package greenfox.instruments;

public class BassGuitar extends StringedInstrument {

  BassGuitar() {
    super.setName("Bass Guitar");
    super.setNumberOfStrings(4);
  }

  BassGuitar(int numberOfStrings) {
    super.setName("Bass Guitar");
    super.setNumberOfStrings(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes Duum-duum-duum" );
  }
}
