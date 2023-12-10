class Sample {

  void sum() {
    int a = 10, b = 0, c;
    try {
      c = a / b;
      System.out.println("code doesn't reach here");
    } catch (ArithmeticException e) {
      System.out.println("Error in Sample Class : " + e);
      throw e;
    }
    System.out.println("remainds");
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    try {
      s.sum();
    } catch (ArithmeticException e) {
      System.out.println("Error in Main Class: " + e);
    }
  }
}
/*
Output:

Error in Sample Class : java.lang.ArithmeticException: / by zero
Error in Main Class: java.lang.ArithmeticException: / by zero
*/
