package testtasks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorkShopExamplesTest<MathUtil> {
    WorkShopExamples workShopExamples;

    @Before
    public void setup() {
      workShopExamples = new WorkShopExamples();
    }

    @Test
    public void addShouldAddTwoNumbersCorrectly() {
      assertEquals(5, workShopExamples.add(2, 3));
    }

    @Test
    public void addShouldNotAddTwoNumbersCorrectly() {
      assertNotEquals(5, workShopExamples.add(2, 2));
    }

    @Test
    public void addShouldGetTheMaxValueInt() {
      assertEquals(2147483647, workShopExamples.add(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void addShouldGetTheMaxValueIntPlusOne() {
      assertEquals(-2147483648, workShopExamples.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void subtractShouldSubtractTwoNumbersCorrectly() {
      assertEquals(5, workShopExamples.subtract(8, 3));
    }

    //And so on...
  }