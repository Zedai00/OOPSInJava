import java.util.Scanner;

public class Main {
  static int[] prefixSumArray(int[] a) {
    for (int i = 1; i < a.length; i++) {
      a[i] = a[i - 1] + a[i];
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Length: ");
    int n = sc.nextInt();
    System.out.print("Enter Array Elements: ");
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter Queries Length: ");
    int q = sc.nextInt();
    a = prefixSumArray(a);
    while (q-- > 0) {
      System.out.print("Enter L: ");
      int l = sc.nextInt();
      System.out.print("Enter R: ");
      int r = sc.nextInt();
      System.out.println("Sum: " + (a[r] - a[l - 1]));
    }
  }
}
