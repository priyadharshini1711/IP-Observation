import java.util.*;

public class Main {

  int a, b, c;
  Scanner sc = new Scanner(System.in);

  static void add() {
    Main m = new Main();
    System.out.println("enter two numbers for sum of a and b");
    m.a = m.sc.nextInt();
    m.b = m.sc.nextInt();
    m.c = m.a + m.b;
    System.out.println("sum : " + m.c);
  }

  static void sub() {
    Main m = new Main();
    System.out.println("enter two numbers for difference of a and b");
    m.a = m.sc.nextInt();
    m.b = m.sc.nextInt();
    m.c = m.a - m.b;
    System.out.println("difference : " + m.c);
  }

  static void multiply() {
    Main m = new Main();
    System.out.println("enter two numbers for product of a and b");
    m.a = m.sc.nextInt();
    m.b = m.sc.nextInt();
    m.c = m.a * m.b;
    System.out.println("product : " + m.c);
  }

  static void division() {
    Main m = new Main();
    System.out.println("enter two numbers for division of a and b");
    m.a = m.sc.nextInt();
    m.b = m.sc.nextInt();
    m.c = m.a / m.b;
    System.out.println("division : " + m.c);
  }

  public static void main(String args[]) {
    add();
    sub();
    multiply();
    division();
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
