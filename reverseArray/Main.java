import java.util.Scanner;

public class Main {
  static int[] reverseArray(int[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      int temp = a[a.length - i - 1];
      a[a.length - i - 1] = a[i];
      a[i] = temp;
    }
    return a;
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
    int[] b = reverseArray(a);
    for (int i = 0; i < n; i++) {
      System.out.print(b[i] + " ");
    }
  }
}
