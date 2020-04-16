import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import other.SymmetricMatrix;

public class SymmetricMatrixTest {

  private SymmetricMatrix symmetricMatrix;

  @Before
  public void setUp() throws Exception {
    symmetricMatrix = new SymmetricMatrix();
  }

  @Test
  public void isSymmetric_Symmetric_True() {
    int[][] test = new int[][]{
        {1, 0, 1},
        {0, 5, 2},
        {1, 2, 7}
    };
    assertTrue(symmetricMatrix.isSymmetric(test));
  }

  @Test
  public void isSymmetric_Assymetric_False() {
    int[][] test = new int[][]{
        {1, 2, 1},
        {0, 5, 2},
        {1, 2, 7}
    };
    assertFalse(symmetricMatrix.isSymmetric(test));
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void isSymmetric_NotValidInputMatrix_Exception() {
    int[][] test = new int[][]{
        {1, 0, 1},
        {0, 5, 2}
    };
    symmetricMatrix.isSymmetric(test);
  }

  // Ha két array-t akarsz összehasonlítani (hogy nem ugyanolyanok):
  // forrás: https://stackoverflow.com/questions/7305612/junit-arrays-not-equal-test
  @Test
  public void isTheTwoMatricesEquals_Not_ReturnFalse() {
    int[] array1 = new int[]{1, 2, 3};
    int[] array2 = new int[]{1, 2};
    assertThat(array1, not(equalTo(array2)));
    // or:
    assertFalse(Arrays.equals(array1, array2));
  }
}
