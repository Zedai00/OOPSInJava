import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String name, branch, pin;
    Scanner x = new Scanner(System.in);
    System.out.print("Enter Student Name: ");
    name = x.next();
    System.out.print("Enter Student Branch: ");
    branch = x.next();
    System.out.print("Enter Student PIN: ");
    pin = x.next();
    Student s = new Student(name, branch, pin);
    System.out.println("The Student Details Are: ");
    System.out.println("Student Name: " + s.getName());
    System.out.println("Student Branch: " + s.getBranch());
    System.out.println("Stundent PIN: " + s.getPin());
  }
}

class Student {
  String name;
  String branch;
  String pin;

  Student(String name, String branch, String pin) {
    this.name = name;
    this.branch = branch;
    this.pin = pin;
  }

  String getName() {
    return this.name;
  }

  String getBranch() {
    return this.branch;
  }

  String getPin() {
    return this.pin;
  }

}
