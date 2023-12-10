class Main {

  public static void main(String[] args) {
    int a = 4, b = 0, c;
    try {
      c = a / b;
    } catch (Exception e) {
      System.out.println("The program has divide by 0 exception");
    }
    System.out.println("Hello World");
  }
}
/*
Output:
The program has divide by 0 exception
Hello World
*/
