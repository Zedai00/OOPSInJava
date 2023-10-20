import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No of Rows: ");
    int row = sc.nextInt();
    if (row == 1) {
      System.out.print("Enter No of Cols: ");
      int col = sc.nextInt();
      int[] a = new int[col];
      System.out.print("Enter Elements: ");
      for (int i = 0; i < col; i++) {
        a[i] = sc.nextInt();
      }
      for (int i = 0; i < row; i++) {
        System.out.print(a[i] + " ");
      }
    } else {
      int[][] a = new int[row][];
      for (int i = 0; i < row; i++) {
        System.out.print("Enter Column For " + i + "th row: ");
        int col = sc.nextInt();
        a[i] = new int[col];
        System.out.print("Enter Elements: ");
        for (int j = 0; j < col; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < a[i].length; j++) {
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
    }
    sc.close();
  }
}
