import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Elements Count: ");
    int n = sc.nextInt();
    System.out.print("Enter Elements: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter Key: ");
    int key = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        System.out.println("Found at " + i);
        return;
      }
    }
    System.out.println("Not Found");
  }
}
