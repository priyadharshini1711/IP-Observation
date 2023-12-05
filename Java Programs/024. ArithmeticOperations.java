import java.util.*;

public class Main {

  int a, b, c;
  Scanner sc = new Scanner(System.in);

  void add() {
    System.out.println("enter two numbers for sum of a and b");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a + b;
    System.out.println("sum : " + c);
  }

  void sub() {
    System.out.println("enter two numbers for difference of a and b");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a - b;
    System.out.println("difference : " + c);
  }

  void multiply() {
    System.out.println("enter two numbers for product of a and b");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a * b;
    System.out.println("product : " + c);
  }

  void division() {
    System.out.println("enter two numbers for division of a and b");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a / b;
    System.out.println("division : " + c);
  }

  public static void main(String args[]) {
    Main m = new Main();
    m.add();
    m.sub();
    m.multiply();
    m.division();
  }
}
/*
output:
enter two numbers for sum of a and b
10
5
sum : 15
enter two numbers for difference of a and b
10
5
difference : 5
enter two numbers for product of a and b
10
5
product : 50
enter two numbers for division of a and b
10
5
division : 2
*/
