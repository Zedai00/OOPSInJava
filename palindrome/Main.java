import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = sc.next();
    String t = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      t = t + s.charAt(i);
    }
    if (s.compareTo(t) == 0) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not A Palindrome");
    }
    sc.close();
  }
}
