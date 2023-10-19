import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter Number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    System.out.println("Count: " + count);
  }
}
