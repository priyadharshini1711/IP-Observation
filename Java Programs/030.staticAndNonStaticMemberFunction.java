import java.util.*;

class Sample {

  static void display() {
    System.out.println("Hello World");
  }

  void add() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("sum : " + c);
  }
}

public class Main {

  public static void main(String args[]) {
    Sample s = new Sample();
    Sample.display();
    s.add();
  }
}
/*
output:
Hello World
enter two numbers
10
5
sum : 15
*/
