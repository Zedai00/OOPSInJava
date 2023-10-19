import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main main = new Main();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Matrix A Row: ");
    int rowa = sc.nextInt();
    System.out.print("Enter Matrix A Col: ");
    int cola = sc.nextInt();
    int[][] a = new int[rowa][cola];
    System.out.println("Enter Matrix Elements: ");
    for (int i = 0; i < rowa; i++) {
      for (int j = 0; j < cola; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.print("Enter Matrix B Row: ");
    int rowb = sc.nextInt();
    System.out.print("Enter Matrix B Col: ");
    int colb = sc.nextInt();
    int[][] b = new int[rowb][colb];
    System.out.println("Enter Matrix Elements: ");
    for (int i = 0; i < rowb; i++) {
      for (int j = 0; j < colb; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    System.out.println("Multiplication is: ");
    int[][] c = main.multiply(rowa, cola, rowb, colb, a, b);
    for (int i = 0; i < rowb; i++) {
      for (int j = 0; j < cola; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

  int[][] multiply(int rowa, int cola, int rowb, int colb, int[][] a,
      int[][] b) {
    int[][] c = new int[rowa][colb];
    if (cola == rowb) {
      for (int i = 0; i < rowa; i++) {
        for (int j = 0; j < colb; j++) {
          for (int k = 0; k < rowb; k++) {
            c[i][j] += a[i][k] * b[k][j];
          }
        }
      }
    }
    return c;
  }
}
