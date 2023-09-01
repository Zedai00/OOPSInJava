import java.util.Scanner;

public class Quadratic {
  public static void main(String[] args) {
    double a, b, c, d;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter quadratic equation if in form ax^2+bx+c then: ");
    System.out.print("Enter a: ");
    a = x.nextInt();
    System.out.print("Enter b: ");
    b = x.nextInt();
    System.out.print("Enter c: ");
    c = x.nextInt();
    d = b * b - (4 * a * c);
    if (d > 0) {
      System.out.println("The roots are real and distinct");
      double r1 = ((-b) + (Math.sqrt(d))) / (2 * a);
      double r2 = ((-b) - (Math.sqrt(d))) / (2 * a);
      System.out.println("The roots are " + r1 + " " + r2);
    } else if (d == 0) {
      System.out.println("The roots are real and equal");
      double r1 = ((-b) + (Math.sqrt(d))) / (2 * a);
      System.out.println("The roots are " + r1 + " " + r1);
    } else {
      System.out.println("The roots are imaginary");
    }
  }
}
