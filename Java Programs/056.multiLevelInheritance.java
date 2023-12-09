class A {

  void display() {
    System.out.println("Class A");
  }
}

class B extends A {

  void display() {
    super.display();
    System.out.println("Class B");
  }
}

class C extends B {

  void display() {
    super.display();
    System.out.println("Class C");
  }
}

class Main {

  public static void main(String[] args) {
    C c = new C();
    c.display();
  }
}
/*
Output:
Class A
Class B
Class C
 */
