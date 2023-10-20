class Person {
  String name;

  Person(String name) { this.name = name; }
}

public class Main {
  public static void main(String[] args) {
    Person person = new Person("Zed");
    System.out.println("Before Calling modifyValue: " + person.name);
    modifyName(person);
    System.out.println("After Calling modifyValue: " + person.name);
  }

  public static void modifyName(Person p) {
    p.name = "Amarjeet";
    System.out.println("Inside modifyName: " + p.name);
  }
}
