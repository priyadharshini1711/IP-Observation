import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[][][] = new int[2][2][2];
    System.out.println("enter a 2*2*2 matrix : ");
    int i, j, k;
    for (i = 0; i < 2; i++) for (j = 0; j < 2; j++) for (
      k = 0;
      k < 2;
      k++
    ) a[i][j][k] = sc.nextInt();
    System.out.println("output matrix : ");
    for (int[][] x : a) for (int[] y : x) for (int z : y) System.out.print(
      z + "\t"
    );
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
