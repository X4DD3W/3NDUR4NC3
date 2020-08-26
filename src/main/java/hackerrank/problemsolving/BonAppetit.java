package hackerrank.problemsolving;

import java.util.List;

public class BonAppetit {

  static void bonAppetit(List<Integer> bill, int k, int b) {
    int sumOfBillWithoutAnna = 0;
    for (int i = 0; i < bill.size(); i++) {
      if (i != k) {
        sumOfBillWithoutAnna += bill.get(i);
      }
    }
    if ((sumOfBillWithoutAnna / 2) == b) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b - (sumOfBillWithoutAnna / 2));
    }
  }
}
