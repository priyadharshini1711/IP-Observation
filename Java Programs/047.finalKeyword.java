class Sample {

  final int a = 10;

  void display() {
    System.out.println("hello variable a : " + a);
  }
}

public class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    s.a++;
    System.out.println("hello variable after increment " + s.a);
    s.display();
  }
}
/*
Error:

Main.java:11: error: cannot assign a value to final variable a
        s.a++;
         ^
1 error

 */
