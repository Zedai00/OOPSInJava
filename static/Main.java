class Main {
  static int x = 10;
  static int y = 20;

  static int add() {
    return x + y;
  }

  static {
    System.out.println("X is: " + x);
    System.out.println("Y is: " + y);
  }

  public static void main(String[] args) {
    System.out.println("The Addition Result is: " + add());
  }
}
