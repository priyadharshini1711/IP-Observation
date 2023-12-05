public class Sample {

  int x;
  static int y;

  void display() {
    x = 10;
    y = 30;
    System.out.println("the value of x is : " + x);
    System.out.println("the value of y is : " + y);
  }

  void getData() {
    x = 20;
    y = 40;
    System.out.println("the value of x is : " + x);
    System.out.println("the value of x is : " + y);
    display();
  }
}

public class Main {

  public static void main(String args[]) {
    Sample s = new Sample();
    s.display();
    s.getData();
  }
}
