class Main {

  public static void main(String[] args) {
    int a = 10, b = 0, c;
    int d[] = { 10, 20, 30 };
    try {
      c = d[10];
      c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Error in Arithmetic Exception : " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error in ArrayIndexOutOfBounds Exception : " + e);
    }
    System.out.println("Hello world");
  }
}
/*
Output:
Error in ArrayIndexOutOfBounds Exception : java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
Hello world
*/
