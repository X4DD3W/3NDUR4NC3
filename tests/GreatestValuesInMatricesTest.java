import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class GreatestValuesInMatricesTest {

  GreatestValuesInMatrices testCase = new GreatestValuesInMatrices();

  @Test
  public void InputAreEmptyArrays_ShouldReturnEmptyArray() {
    int[][] testOne = new int[0][0];
    int[][] testTwo = new int[0][0];
    int result[][] = testCase.greatestValuePicker(testOne, testTwo);
    int excpected[][] = new int[0][0];
    assertArrayEquals(excpected, result);
  }
}