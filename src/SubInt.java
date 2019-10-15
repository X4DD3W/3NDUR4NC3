import java.util.Arrays;

public class SubInt {

  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    System.out.println(Arrays.toString(subInt(2, new int[]{1, 121, 34, 52, 61})));
    //  should print: `[1, 3]`
    System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
    //  should print: '[]'

  }

  public static int[] subInt(int num, int[] arr) {
    String[] array = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      array[i] = String.valueOf(arr[i]);
    }
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (array[i].contains(String.valueOf(num))) {
        counter++;
      }
    }
    int[] result = new int[counter];
    int resultIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (array[i].contains(String.valueOf(num))) {
        result[resultIndex] = i;
        resultIndex++;
      }
    }
    return result;
  }

}