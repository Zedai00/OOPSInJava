import java.util.Scanner;

public class Main {
  static int[] sortSquares(int[] a) {
    int i = 0;
    int j = a.length - 1;
    int[] b = new int[a.length];
    int k = 0;
    while (i <= j) {
      if (Math.abs(a[i]) > Math.abs(a[j])) {
        b[k++] = a[i] * a[i];
        i++;
      } else {
        b[k++] = a[j] * a[j];
        j--;
      }
    }
    return b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Elements: ");
    int n = sc.nextInt();
    System.out.print("Enter Array Elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    a = sortSquares(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
