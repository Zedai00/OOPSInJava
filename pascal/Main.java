import java.util.Scanner;
import zed.array.Display;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of Rows: ");
    int r = sc.nextInt();
    int[][] a = new int[r][];
    for (int i = 0; i < r; i++) {
      a[i] = new int[i + 1];
      a[i][0] = a[i][i] = 1;
      for (int j = 1; j < i; j++) {
        a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
      }
    }
    Display p = new Display();
    p.print(a);
  }
}
