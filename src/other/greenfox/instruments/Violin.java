package other.greenfox.instruments;

public class Violin extends StringedInstrument {

  Violin() {
    super.setName("Violin");
    super.setNumberOfStrings(4);
  }

  Violin(int numberOfStrings) {
    super.setName("Electric Guitar");
    super.setNumberOfStrings(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes Screech" );
  }
}

