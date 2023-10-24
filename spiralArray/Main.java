import java.util.Scanner;

public class Main {
  static void spiralOrder(int r, int c, int[][] a) {

    int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
    int elm = 0;
    while (elm < r * c) {
      for (int i = leftCol; i <= rightCol && elm < r * c; i++) {
        System.out.print(a[topRow][i] + " ");
        elm++;
      }
      topRow++;
      for (int i = topRow; i <= bottomRow && elm < r * c; i++) {
        System.out.print(a[i][rightCol] + " ");
        elm++;
      }
      rightCol--;
      for (int i = rightCol; i >= leftCol && elm < r * c; i--) {
        System.out.print(a[bottomRow][i] + " ");
        elm++;
      }
      bottomRow--;
      for (int i = bottomRow; i >= topRow && elm < r * c; i--) {
        System.out.print(a[i][leftCol] + " ");
        elm++;
      }
      leftCol++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row: ");
    int r = sc.nextInt();
    System.out.print("Enter Column: ");
    int c = sc.nextInt();
    int[][] a = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    spiralOrder(r, c, a);
  }
}
