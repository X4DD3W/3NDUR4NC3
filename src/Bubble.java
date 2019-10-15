public class Bubble {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }

  public static int[] bubble(int[] arr) {
    int[] result = new int[arr.length];
    int counter = 0;
    int maxValue = 0;
    for (int value : arr) {
      if (maxValue <= value) {
        maxValue = value;
      }
    }
    int minValue = maxValue;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (minValue >= arr[j]) {
          result[counter] = arr[j];
          minValue = result[counter];
        }
      }
      // Itt még meg kellene neki mondani, hogy ne ötször tegye be az 5-öt... :)
      counter++;
    }
    return result;
  }

  public static int[] advancedBubble(int[] arr, boolean descending) {
    int[] result = new int[arr.length];
    return result;
  }

}