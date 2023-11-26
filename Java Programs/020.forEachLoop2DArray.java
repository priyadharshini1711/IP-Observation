import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][3];
    System.out.println("enter a 3*3 matrix : ");
    int i, j;
    for (i = 0; i < 3; i++) for (j = 0; j < 3; j++) a[i][j] = sc.nextInt();
    System.out.println("output matrix : ");
    for (int[] x : a) {
      for (int y : x) {
        System.out.print(y + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
/*
output
enter a 3*3 matrix : 
1
2
3
4
5
6
7
8
9
output matrix : 
1	2	3	
4	5	6	
7	8	9	


*/
