import java.util.Scanner;

public class Main {
  static boolean equalSumPartition(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int prefix = a[i];
      int suffix = a[a.length - 1] - prefix;
      if (prefix == suffix) {
        return true;
      }
    }
    return false;
  }

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
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    a = prefixSumArray(a);
    if (equalSumPartition(a)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }
}
