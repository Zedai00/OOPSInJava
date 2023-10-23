import java.util.Scanner;

public class Main {
  static int[] prefixSumArray(int[] a) {
    for (int i = a.length - 2; i >= 0; i--) {
      a[i] = a[i + 1] + a[i];
    }
    return a;
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
    a = prefixSumArray(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
