import java.util.Scanner;

public class Main {
  static void rotateArrayByK(int[] a, int k) {
    for (int i = a.length - k; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    for (int i = 0; i < a.length - k; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Length: ");
    int n = sc.nextInt();
    System.out.print("Enter Elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter K: ");
    int k = sc.nextInt() % n;
    rotateArrayByK(a, k);
  }
}
