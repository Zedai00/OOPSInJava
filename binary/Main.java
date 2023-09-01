import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Elements Count: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter Elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter Key: ");
    int key = sc.nextInt();
    int l = 0, h = n - 1;
    while (l < h) {
      int mid = (l + h) / 2;
      if (arr[mid] == key) {
        System.out.println("Found at " + mid);
        return;
      } else if (arr[mid] > key) {
        h = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    System.out.println("Not Found");
  }
}
