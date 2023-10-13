import java.util.Arrays;

class Main {
  void sort(int[] a, int l, int h) {
    if (l < h) {
      int pivot = a[l], i = l, j = h;
      while (i < j) {
        while (a[i] <= pivot && i < h)
          i++;
        while (a[j] > pivot)
          j--;
        if (i < j)
          swap(a, i, j);
      }
      swap(a, l, j);
      sort(a, l, j - 1);
      sort(a, j + 1, h);
    }
  }

  void swap(int[] a, int i, int j) {
    int t = a[j];
    a[j] = a[i];
    a[i] = t;
  }

  public static void main(String[] args) {
    int[] a = { 65, 70, 75, 80, 85, 60, 55, 50, 45 };
    Main m = new Main();
    m.sort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }
}
