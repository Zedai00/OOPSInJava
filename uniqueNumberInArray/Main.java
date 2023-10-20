import java.util.Scanner;

public class Main {
  static int uniqueNumber(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          a[i] = a[j] = -1;
        }
      }
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {
        return a[i];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Length Of Array: ");
    int n = sc.nextInt();
    System.out.print("Enter Elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int unique = uniqueNumber(a);
    if (unique == -1) {
      System.out.println("Not Found");
    } else {

      System.out.println("Unique Number: " + unique);
    }
  }
}
