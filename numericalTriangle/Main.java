import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Rows: ");
    int r = sc.nextInt();
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(j + 1);
      }
      System.out.println();
    }
  }
}
