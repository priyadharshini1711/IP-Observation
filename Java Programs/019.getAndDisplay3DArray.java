import java.util.*;

class Main {

  public static void main(String[] args) {
    System.out.println("enter a 3D Array of dimension 2*2*2");
    int a[][][] = new int[2][2][2];
    Scanner sc = new Scanner(System.in);
    int i, j, k;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        for (k = 0; k < a[i][j].length; k++) {
          System.out.print(
            "enter the value for (i,j) (" + i + " " + j + " " + k + ")"
          );
          a[i][j][k] = sc.nextInt();
          System.out.println();
        }
      }
    }

    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        for (k = 0; k < a[i][j].length; k++) {
          String placeholder = "a[" + i + "][" + j + "][" + k + "] = ";
          System.out.println(placeholder + a[i][j][k] + "\t");
        }
      }
    }

    sc.close();
  }
}
/*
output
enter a 3D Array of dimension 2*2*2
enter the value for (i,j) (0 0 0)1

enter the value for (i,j) (0 0 1)1

enter the value for (i,j) (0 1 0)2

enter the value for (i,j) (0 1 1)2

enter the value for (i,j) (1 0 0)3

enter the value for (i,j) (1 0 1)3

enter the value for (i,j) (1 1 0)4

enter the value for (i,j) (1 1 1)4

a[0][0][0] = 1	
a[0][0][1] = 1	
a[0][1][0] = 2	
a[0][1][1] = 2	
a[1][0][0] = 3	
a[1][0][1] = 3	
a[1][1][0] = 4	
a[1][1][1] = 4	

*/
