abstract class Sample {

  void run() {
    System.out.println("run method");
  }

  abstract void display();
}

class A extends Sample {

  void display() {
    System.out.println("Class A");
  }
}

class B extends A {

  void display() {
    System.out.println("Class B");
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new A();
    A a = new A();
    B b = new B();
    s = a;
    s.display();
    s = b;
    s.display();
  }
}
/*
Output:
Class A
Class B
*/
