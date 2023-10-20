import java.util.Scanner;

public class Main {
  static int sumTotal(int[] a, int t) {
    int ans = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if ((i + j) == t) {
          ans++;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Size: ");
    int n = sc.nextInt();
    System.out.print("Enter Elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter Target: ");
    int t = sc.nextInt();
    System.out.println("Total Pairs: " + sumTotal(a, t));
  }
}
