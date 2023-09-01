import java.util.Scanner;

public class fib {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.print("Enter A Number: ");
    int n = x.nextInt();
    int a = 0, b = 1, c;
    System.out.print("Fibonacci Sequence is:");
    for (int i = 0; i < n; i++) {
      System.out.print(" " + a);
      c = a + b;
      a = b;
      b = c;
    }
  }
}
