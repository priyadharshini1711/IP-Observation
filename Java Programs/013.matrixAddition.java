import java.util.*;

class Main {

  public static void main(String[] args) {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    int i, j;
    System.out.println("enter 3 * 3 matrix A:");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("enter 3 * 3 matrix B:");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        b[i][j] = sc.nextInt();
        c[i][j] = a[i][j] + b[i][j];
      }
    }
    System.out.println("sum of martix A and B are: ");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

/*
output1:
enter 3 * 3 matrix A:
1
2
3
4
5
6
7
8
9
enter 3 * 3 matrix B:
1
2
3
4
5
6
7
8
9
sum of martix A and B are:
2 4 6 
8 10 12 
14 16 18 
*/
