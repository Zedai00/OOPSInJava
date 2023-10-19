import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    System.out.print("Enter Column: ");
    int c = sc.nextInt();
    for (int i = 0; i < r; i++) {
      for (int j = 1; j <= c; j++) {
        if ((i == 0 || i == r - 1) || (j == 1 || j == c)) {
          System.out.print(j);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
