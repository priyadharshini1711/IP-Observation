import java.util.*;

class Fibonacci {

  void fibonacci() {
    int i, p1 = -1, p2 = 1, n, s = 0;
    System.out.println("enter number of digits");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (i = 0; i < n; i++) {
      s = p1 + p2;
      System.out.println(s);
      p1 = p2;
      p2 = s;
    }
  }
}

public class Main {

  public static void main(String args[]) {
    Fibonacci fib = new Fibonacci();
    fib.fibonacci();
  }
}
/*
output:
enter number of digits
10
0
1
1
2
3
5
8
13
21
34
*/
