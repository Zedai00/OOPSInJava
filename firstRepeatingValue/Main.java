import java.util.Scanner;
public class Main {
  static int firstRepeatingValue(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j])
          return a[i];
      }
    }
    return -1;
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
    int rep = firstRepeatingValue(a);
    if (rep == -1) {
      System.out.println("Not Found");
    } else {

      System.out.println("Repeating Element: " + rep);
    }
  }
}
