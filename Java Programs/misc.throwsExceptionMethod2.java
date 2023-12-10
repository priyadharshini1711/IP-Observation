class Sample {

  void sum() throws ArithmeticException {
    int a = 10, b = 0, c;
    c = a / b;
    ArithmeticException e = new ArithmeticException();
    // throw e;
    throw new ArithmeticException();
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

Error in Main Class: java.lang.ArithmeticException: / by zero
*/
