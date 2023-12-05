class Sample {

  void display() {
    System.out.println("hello world");
  }
}

public class Main {

  static Sample s = new Sample();

  public static void main(String args[]) {
    s.display();
  }
}
/*
output:

hello world
*/
