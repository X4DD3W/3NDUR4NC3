package hackerrank.java;

import java.util.Scanner;

interface AdvancedArithmetic {

  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

  @Override
  public int divisor_sum(int n) {
    // "divisor_sum" function just takes an integer as input and return the sum of all its divisors.
    // For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.
    // The value of n will be at most 1000.
    int result = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        result += i;
      }
    }
    return result;
  }
}

class InterfaceOne {

  public static void main(String[] args) {
    MyCalculator my_calculator = new MyCalculator();
    System.out.print("I implemented: ");
    ImplementedInterfaceNames(my_calculator);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(my_calculator.divisor_sum(n) + "\n");
    sc.close();
  }

  // ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
  private static void ImplementedInterfaceNames(Object o) {
    Class[] theInterfaces = o.getClass().getInterfaces();
    for (Class theInterface : theInterfaces) {
      String interfaceName = theInterface.getName();
      System.out.println(interfaceName);
    }
  }
}
