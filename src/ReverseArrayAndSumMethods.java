import java.util.Arrays;

public class ReverseArrayAndSumMethods {

  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int[] aj = {3, 12, 5, 6, 77};
    System.out.println(Arrays.toString(reverser(aj)));
    System.out.println(sum(aj));

  }
  // A korábbi megoldásom (az eredeti feladat) nem jó
  public static int[] reverser(int[] arr) {
    int[] result = new int[arr.length];
    int counter = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[counter];
      counter--;
    }
    return result;
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

}
