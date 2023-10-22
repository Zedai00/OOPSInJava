import java.util.Scanner;

public class Main {
  static void swapTwoValues(int a, int b) {
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swapping");
    System.out.printf("A: %d and B: %d\n", a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int a = sc.nextInt();
    System.out.print("Enter B: ");
    int b = sc.nextInt();
    System.out.println("Before Swapping");
    System.out.printf("A: %d and B: %d\n", a, b);
    swapTwoValues(a, b);
  }
}
