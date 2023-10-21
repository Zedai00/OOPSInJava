import java.util.Scanner;

public class Main {
  static int findSecondLargest(int[] a) {
    int largestIndex = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[largestIndex] < a[i]) {
        largestIndex = i;
      }
    }
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (secondLargest < a[i] && i != largestIndex) {
        secondLargest = a[i];
      }
    }
    return secondLargest;
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
    int sl = findSecondLargest(a);
    System.out.println("Second Largest: " + sl);
  }
}
