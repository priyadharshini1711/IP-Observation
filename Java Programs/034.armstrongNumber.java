import java.lang.Math;
import java.util.*;

class Armstrong {

  void armstrong() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number to check if armstrong");

    int n = sc.nextInt();
    int sum = 0;
    int m = n;
    int a;
    while (m > 0) {
      a = m % 10;
      sum += Math.pow(a, 3);
      m = m / 10;
    }
    if (sum == n) {
      System.out.println("yes armstrong number");
    } else {
      System.out.println("no not a armstrong number");
    }
  }
}

public class Main {

  public static void main(String args[]) {
    Armstrong arm = new Armstrong();
    arm.armstrong();
  }
}
/*
output1:
enter number to check if armstrong
153
yes armstrong number

output2:
enter number to check if armstrong
454
no not a armstrong number


output3:
enter number to check if armstrong
370
yes armstrong number
*/
