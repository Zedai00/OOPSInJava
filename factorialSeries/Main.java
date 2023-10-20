import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter Length: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    System.out.println("Factorial: " + fact);
  }
}
