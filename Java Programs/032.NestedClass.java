class Outer {

  public class Inner {

    void display() {
      System.out.println("Hello World Inner Class");
    }
  }

  void display() {
    System.out.println("Hello World Outter Class");

    Inner i = new Inner();
    i.display();
  }
}

public class Main {

  public static void main(String args[]) {
    Outer o = new Outer();
    o.display();
  }
}
/*
output:

Hello World Outter Class
Hello World Inner Class
*/
