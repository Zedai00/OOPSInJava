package zed.array;

import java.util.Scanner;

public class Display {

  public static void print(int[] a) {
    if (a.length != 0) {
      System.out.print("┌");
    }
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print("─┬");
    }
    System.out.println("─┐");
    for (int i = 0; i < a.length; i++) {
      System.out.print("│" + a[i]);
    }
    System.out.println("│");
    System.out.print("└");
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print("─┴");
    }
    System.out.println("─┘");
  }

  public static void print(int[][] a) {
    int row = a.length;
    if (row != 0) {

      System.out.print("┌");
    }
    for (int i = 0; i < a.length; i++) {

      if (i == 0) {
        for (int j = 0; j < a[i].length - 1; j++) {
          System.out.print("─┬");
        }
        System.out.println("─┐");
      }
      for (int j = 0; j < a[i].length; j++) {
        System.out.print("│" + a[i][j]);
      }
      System.out.println("│");

      if (i + 1 != a.length) {

        System.out.print("├");
        if (a[i].length < a[i + 1].length) {

          for (int j = 0; j < a[i + 1].length - 1; j++) {
            System.out.print("─┼");
          }
          System.out.println("─┐");
        } else {
          for (int j = 0; j < a[i + 1].length; j++) {
            System.out.print("─┼");
          }
          System.out.println("─┘");
        }

      } else {
        System.out.print("└");
        for (int j = 0; j < a[i].length - 1; j++) {
          System.out.print("─┴");
        }
        System.out.println("─┘");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No of Rows: ");
    int row = sc.nextInt();
    if (row == 1) {
      System.out.print("Enter No of Cols: ");
      int col = sc.nextInt();
      int[] a = new int[col];
      System.out.print("Enter Elements: ");
      for (int i = 0; i < col; i++) {
        a[i] = sc.nextInt();
      }
      Display p = new Display();
      p.print(a);
    } else {
      int[][] a = new int[row][];
      for (int i = 0; i < row; i++) {
        System.out.print("Enter Column For " + i + "th row: ");
        int col = sc.nextInt();
        a[i] = new int[col];
        System.out.print("Enter Elements: ");
        for (int j = 0; j < col; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      Display p = new Display();
      p.print(a);
    }
    sc.close();
  }
}
