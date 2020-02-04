import java.util.Scanner;

public class AverageOfInput {

  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, give me 5 integers:");
    int a, b, c, d, e;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();
    e = scanner.nextInt();
    int sum = a + b + c + d + e;
    float avg = sum / 5;
    System.out.println(sum);
    System.out.println(avg);

  }
}
