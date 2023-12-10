class A {

  int a;

  A(int x) {
    a = x;
  }

  void display() {
    System.out.println("Class A : " + a);
  }
}

class B extends A {

  int b;

  B(int x, int y) {
    super(x);
    b = y;
  }

  void display() {
    super.display();
    System.out.println("Class B : " + b);
  }
}

class C extends B {

  int c;

  C(int x, int y, int z) {
    super(x, y);
    c = z;
  }

  void display() {
    super.display();
    System.out.println("Class C : " + c);
  }
}

class Main {

  public static void main(String[] args) {
    C c = new C(10, 20, 30);
    c.display();
  }
}
/*
Output:
Class A : 10
Class B : 20
Class C : 30
*/
