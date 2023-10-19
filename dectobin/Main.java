import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter Number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int temp = 1;
    while (n > 0) {
      int rem = n % 2;
      sum = sum + rem * temp;
      n = n / 2;
      temp = temp * 10;
    }
    System.out.print("Binary: " + sum);
    sc.close();
  }
}
