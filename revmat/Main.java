import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    System.out.print("Enter Col: ");
    int c = sc.nextInt();
    int[][] a = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < r; i++) {
      int count = 0;
      for (int j = c - 1; j > (c / 2) - 1; j--) {
        int temp = a[i][j];
        a[i][j] = a[i][count];
        a[i][count] = temp;
        count++;
      }
    }
    for (int i = 0; i < c; i++) {
      int count = 0;
      int t = (r / 2) - 1;
      for (int j = r - 1; j > (r / 2) - 1; j--) {
        int temp = a[j][i];
        a[j][i] = a[count][i];
        a[count][i] = temp;
        count++;
      }
    }
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
