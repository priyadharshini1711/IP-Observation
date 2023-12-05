public class Main {

  void display() {
    System.out.println("print a value display");
  }

  void display(int x) {
    System.out.println("print a value : " + x);
  }

  public static void main(String args[]) {
    Main m = new Main();
    m.display();
    m.display(5);
  }
}
/*
output:

print a value display
print a value : 5
*/
