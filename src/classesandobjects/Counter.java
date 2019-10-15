package classesandobjects;

public class Counter {

  private int value;
  private int initial;

  Counter() {
    this.value = 0;
  }

  Counter(int value) {
    this.value = value;
    this.initial = value;
  }

  public void add(int number){
    value += number;
  }

  public void add() {
    value++;
  }

  public int get() {
    return this.value;
  }
  // also we can reset() the value to the initial value
  public void reset() {
    value = initial;
  }

}
