package hackerrank.java;

class JavaStack {

  public static void main(String[] args) {
    System.out.println(isBalanced("{}()")); // true
    System.out.println(isBalanced("{(})")); // false
  }

  static boolean isBalanced(String s) {
    while (s.length() != (s = s.replaceAll("\\(\\)|\\{}", "")).length()) {
    }
    return s.isEmpty();
  }
}

// region Parser OLD
/*class Parser {
  boolean isBalanced(String s) {
    if (s.isEmpty()) {
      return true;
    }

    if (s.length() % 2 != 0) {
      return false;
    }

    char[] chars = s.toCharArray();

    int counter = 0;
    String temp = "";
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '(' || chars[i] == '{') {
        counter++;
        temp += chars[i];
      } else {
        if ((chars[i] == ')' || chars[i] == '}') &&
            (temp.charAt(temp.length() - 1) == '(' ||
                temp.charAt(temp.length() - 1) == '{')) {
          counter--;
          temp = temp.replace(temp.charAt(temp.length() - 1), '0');
        }
      }
    }
    if (counter % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}*/
// endregion
