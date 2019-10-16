package instruments;

abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;

  StringedInstrument() {
  }

  /*void sound() {
    play();
  }*/

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

}
