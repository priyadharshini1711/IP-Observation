import java.util.*;

class GetData {

  int a, b;

  void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two number");
    a = sc.nextInt();
    b = sc.nextInt();
  }
}

class Arithmetic extends GetData {

  void add() {
      System.out.println("Add");
    getData();
    int c = a + b;
    System.out.println("sum : " + c);
  }

  void sub() {
      System.out.println("Subtraction");
    getData();
    int c = a - b;
    System.out.println("difference : " + c);
  }

  void multiply() {
      System.out.println("Multiply");
    getData();
    int c = a * b;
    System.out.println("product : " + c);
  }

  void division() {
      System.out.println("Division");
    getData();
    int c = a / b;
    System.out.println("division : " + c);
  }
}

public class Main {

  public static void main(String args[]) {
    Arithmetic a = new Arithmetic();
    a.add();
    a.sub();
    a.multiply();
    a.division();
  }
}

/*
output:

Add
enter two number
10
5
sum : 15
Subtraction
enter two number
10
5
difference : 5
Multiply
enter two number
10
5
product : 50
Division
enter two number
10
5
division : 2
*/
