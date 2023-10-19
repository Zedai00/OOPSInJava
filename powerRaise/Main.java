import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A: ");
    int a = sc.nextInt();
    System.out.print("Enter B: ");
    int b = sc.nextInt();
    int result = 1;
    for (int i = 0; i < b; i++) {
      result *= a;
    }
    System.out.println("Result: " + result);
  }
}
