import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter Count of Strings: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print("Enter Strings: ");
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (s[i].compareTo(s[j]) < 0) {
          String temp = s[i];
          s[i] = s[j];
          s[j] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(s[i] + " ");
    }
    sc.close();
  }
}
