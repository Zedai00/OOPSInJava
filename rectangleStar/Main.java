import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows: ");
    int r = sc.nextInt();
    System.out.print("Enter Columns: ");
    int c = sc.nextInt();
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
