package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DesignerPDFViewer {

  public static void main(String[] args) {
    int[] h = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5,
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    String word = "dedaf a";
    System.out.println(designerPdfViewer(h, word));
  }

  private static int designerPdfViewer(int[] h, String word) {
    String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    char[] alphaChar = alphabetString.toCharArray();
    String text = word.replaceAll(" ", "");
    char[] chars = text.toCharArray();
    List<Integer> sizeOfChars = new ArrayList<>();

    for (char aChar : chars) {
      for (int j = 0; j < alphaChar.length; j++) {
        if (aChar == alphaChar[j]) {
          sizeOfChars.add(h[j]);
        }
      }
    }
    int maxSize = 0;
    for (int value : sizeOfChars) {
      if (maxSize < value) {
        maxSize = value;
      }
    }
    return maxSize * sizeOfChars.size();
  }
}
