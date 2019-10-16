package gnirts;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

   String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(length() - 1 - index);
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
    return this.string.codePoints();
  }
}
