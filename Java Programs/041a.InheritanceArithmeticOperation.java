import java.util.*;

class Base {

  int a, b;

  void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers : ");
    a = sc.nextInt();
    b = sc.nextInt();
  }
}

class Sum extends Base {

  int s;

  void add() {
    System.out.println("Add");
    getData();
    s = a + b;
    System.out.println("sum : " + s);
  }
}

class Difference extends Base {

  int s;

  void sub() {
    System.out.println("Sub");
    getData();
    s = a - b;
    System.out.println("difference : " + s);
  }
}

class Multiply extends Base {

  int s;

  void mul() {
    System.out.println("multiply");
    getData();
    s = a * b;
    System.out.println("product : " + s);
  }
}

class Division extends Base {

  int s;

  void div() {
    System.out.println("Division");
    getData();
    s = a / b;
    System.out.println("division : " + s);
  }
}

public class Main {

  public static void main(String[] args) {
    Sum s = new Sum();
    Difference diff = new Difference();
    Multiply m = new Multiply();
    Division d = new Division();
    s.add();
    diff.sub();
    m.mul();
    d.div();
  }
}
/*
Output:
Add
enter two numbers : 
10
5
sum : 15
Sub
enter two numbers : 
10
5
difference : 5
multiply
enter two numbers : 
10
5
product : 50
Division
enter two numbers : 
10
5
division : 2
 */
