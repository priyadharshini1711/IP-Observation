class Base {

  int a, b;

  Base(int x, int y) {
    a = x;
    b = y;
  }
}

class Derived extends Base {

  int i, j;

  Derived(int p, int q, int m, int n) {
    super(q, n);
    i = 100;
    j = 200;
    System.out.println("i : " + i);
    System.out.println("j : " + j);
  }
}

public class Main {

  public static void main(String[] args) {
    Derived d = new Derived(10, 20, 30, 40);
    System.out.println("values are");
    System.out.println("i : " + d.i);
    System.out.println("j : " + d.j);
    System.out.println("a : " + d.a);
    System.out.println("b : " + d.b);
  }
}
/*
Output:
i : 100
j : 200
values are
i : 100
j : 200
a : 20
b : 40

 */
