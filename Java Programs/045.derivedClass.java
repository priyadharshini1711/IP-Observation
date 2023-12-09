class Base {

  int a, b;

  Base() {
    a = 10;
    b = 20;
  }
}

class Derived extends Base {

  int x, y;

  {
    x = 66;
    y = 77;
  }
}

public class Main {

  public static void main(String[] args) {
    Derived d = new Derived();
    System.out.println("values are : ");
    System.out.println("a : " + d.a);
    System.out.println("b : " + d.b);
    System.out.println("x : " + d.x);
    System.out.println("y : " + d.y);
  }
}
/*
Output:
values are
a : 10
b : 20
x : 66
y : 77
 */
