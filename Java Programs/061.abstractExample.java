abstract class Sample {

  void run() {
    System.out.println("Run Method");
  }

  abstract void display();
}

class Example extends Sample {

  void display() {
    System.out.println("Hello World");
  }
}

class Test extends Example {

  void display() {
    System.out.println("Test Display");
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Example();
    Example e = new Example();
    Test t = new Test();
    s = e;
    s.display();
    s.run();
    s = t;
    s.display();
    Sample st1 = new Example();
    st1.display();
    Sample st2 = new Test();
    st2.display();
  }
}
/*
Output:

Hello World
Run Method
Test Display
Hello World
Test Display
*/
