class Sample {

  void sum() {
    int a = 10, b;
    try {
      b = a / 0;
    } catch (ArithmeticException e) {
      System.out.println("Error : " + e);
    }
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    s.sum();
  }
}
/*
Output:

Error : java.lang.ArithmeticException: / by zero
*/
