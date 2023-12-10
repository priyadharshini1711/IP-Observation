class Sample {

  void sum() {
    int a = 10, b = 0, c;
    try {
      c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Error : " + e);
    } finally {
      System.out.println("reachable code");
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
reachable code
*/
