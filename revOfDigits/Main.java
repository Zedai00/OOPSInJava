import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter Number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    while (n > 0) {
      rev = rev * 10 + (n % 10);
      n /= 10;
    }
    System.out.println("Reverse: " + rev);
  }
}
