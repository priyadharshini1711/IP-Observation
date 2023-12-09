class Base {

  void display() {
    int x = 10;
    System.out.println("Derived " + x);
  }
}

class Derived extends Base {

  void display() {
    super.display();
    System.out.println("Base");
  }
}

class Main {

  public static void main(String[] args) {
    Derived d = new Derived();
    Base b = new Base();
    b = d;
    b.display();
    Base obj = new Base();
    b = obj;
    b.display();
  }
}
/*
Output:
Derived 10
Base
Derived 10
*/
