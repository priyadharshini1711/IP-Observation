import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = scanner.nextInt();
    int[][] array = new int[rows][columns];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Enter element at position [" + i + "][" + j + "]: ");
        array[i][j] = scanner.nextInt();
      }
    }
    System.out.println("The entered 2D array is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    scanner.close();
  }
}

/*
Output:

Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the array:
Enter element at position [0][0]: 1
Enter element at position [0][1]: 2
Enter element at position [0][2]: 3
Enter element at position [1][0]: 4
Enter element at position [1][1]: 5
Enter element at position [1][2]: 6
The entered 2D array is:
1 2 3 
4 5 6 
*/