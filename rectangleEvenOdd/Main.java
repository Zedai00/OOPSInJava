import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    System.out.print("Enter Column: ");
    int c = sc.nextInt();
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("2");
        }
      }
      System.out.println();
    }
  }
}
