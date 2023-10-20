import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows Count: ");
    int r = sc.nextInt();
    System.out.println("Enter Columns Count: ");
    int c = sc.nextInt();
    System.out.println("Enter Elements of arr1: ");
    int[][] a = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter Elements of arr2: ");
    int[][] b = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    System.out.println("The Addition is: ");
    int[][] add = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        add[i][j] = a[i][j] + b[i][j];
      }
    }
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.println(add[i][j] + " ");
      }
    }
    sc.close();
  }
}
