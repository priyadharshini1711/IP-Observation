public class Main {

  static void sort() {
    String str[] = { "gamma", "beta", "alpha", "cube" };
    String temp;
    int i, j;
    int n = str.length;
    System.out.println("Initial Order : ");
    for (i = 0; i < n; i++) {
      System.out.println(str[i]);
    }
    System.out.println("\nSorted Order : ");
    for (i = 0; i < n; i++) {
      for (j = i + 1; j < n; j++) {
        if (str[i].compareTo(str[j]) > 0) {
          temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
      System.out.println(str[i]);
    }
  }

  public static void main(String[] args) {
    sort();
  }
}
/*
Output:
Initial Order : 
gamma
beta
alpha
cube

Sorted Order : 
alpha
beta
cube
gamma
 */
