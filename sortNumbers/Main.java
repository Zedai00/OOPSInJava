import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter Length of Numbers: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    System.out.print("Enter List Of Numbers: ");
    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (num[i] < num[j]) {
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(num[i] + " ");
    }
    sc.close();
  }
}
