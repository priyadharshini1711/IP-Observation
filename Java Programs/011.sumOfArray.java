import java.util.*;

class Main {

  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    int i;
    System.out.println("enter 5 numbers:");
    for (i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    int sum = 0;
    for (i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println("sum : " + sum);
    sc.close();
  }
}

/*
output1:
enter 5 numbers:
1
2
3
4
5
sum : 15
*/
