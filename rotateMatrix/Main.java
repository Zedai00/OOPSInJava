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
      for (int j = 0; j < i; j++) {
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
      }
    }

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < (c / 2); j++) {
        int temp = a[i][c - j - 1];
        a[i][c - j - 1] = a[i][j];
        a[i][j] = temp;
      }
    }

    System.out.print("--");
    for (int i = 0; i < r + r + 1; i++) {
      System.out.print(" ");
    }
    System.out.print("--");
    System.out.println();
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (j == 0) {
          System.out.print("|");
        }
        System.out.print(" " + a[i][j] + " ");
        if (j == (c - 1)) {
          System.out.print("|");
        }
      }
      System.out.println();
    }
    System.out.print("--");
    for (int i = 0; i < r + r + 1; i++) {
      System.out.print(" ");
    }
    System.out.print("--");
  }
}
