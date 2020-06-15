package other.greenfox.gnirts;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {

  String string;

  Shifter(String string, int x){
    CharSequence temp = string.subSequence(x, string.length());
    this.string = (String) temp;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.string.subSequence(start, end);
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
