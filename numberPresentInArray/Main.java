import java.util.Scanner;

public class Main {

  static boolean find(int[] a, int f) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == f) {
        return true;
      }
    }
    return false;
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
    while (true) {
      System.out.print("Enter Number to Find: ");
      int f = sc.nextInt();
      if (find(a, f)) {
        System.out.println("YES");
      } else {
        System.out.println("No");
      }
    }
  }
}
