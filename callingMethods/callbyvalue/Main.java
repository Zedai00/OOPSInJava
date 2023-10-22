public class Main {
  public static void main(String[] args) {
    int num = 10;
    System.out.println("Before Calling modifyValue: " + num);
    modifyValue(num);
    System.out.println("After Calling modifyValue: " + num);
  }

  public static void modifyValue(int num) {
    num = num * 2;
    System.out.println("Inside modifyValue: " + num);
  }
}
