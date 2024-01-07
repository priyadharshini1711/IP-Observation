import java.util.*;

class Main {

  public static void main(String[] args) {
    int a[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    int i, j;
    System.out.println("enter 3 * 3 matrix:");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("entered values are : ");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

/*
output1:
enter 3 * 3 matrix:
1
2
3
4
5
6
7
8
9
entered values are : 
1 2 3 
4 5 6 
7 8 9 
*/
