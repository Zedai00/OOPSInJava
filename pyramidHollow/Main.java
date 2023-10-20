import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r - i; j++) {
        if (j == r - i || j == r + i) {
          System.out.println(i);
        } else {
          System.out.print(" ");
        }
      }
      // for (int j = 0; j > r + i; j--) {
      // System.out.print(i);
      // }
      System.out.println();
    }
  }
}
