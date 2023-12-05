import java.util.Scanner;

class Sample {

  int a, b, c;

  void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    a = sc.nextInt();
    b = sc.nextInt();
  }
}

class Arithmetic {

  Sample s = new Sample();

  void sum() {
    System.out.println("Add");
    s.getData();
    int c = s.a + s.b;
    System.out.println("sum : " + c);
  }

  void sub() {
    System.out.println("Subtract");
    s.getData();
    int c = s.a - s.b;
    System.out.println("difference : " + c);
  }

  void multiply() {
    System.out.println("Multiply");
    s.getData();
    int c = s.a * s.b;
    System.out.println("product : " + c);
  }

  void division() {
    System.out.println("Division");
    s.getData();
    int c = s.a / s.b;
    System.out.println("divison : " + c);
  }
}

public class Main {

  public static void main(String[] args) {
    Arithmetic a = new Arithmetic();
    a.sum();
    a.sub();
    a.multiply();
    a.division();
  }
}
/*
output:

Add
enter two numbers
10
5
sum : 15
Subtract
enter two numbers
10
5
difference : 5
Multiply
enter two numbers
10
5
product : 50
Division
enter two numbers
10
5
divison : 2
*/
