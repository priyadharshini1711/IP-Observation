import myPackage.*;

class B {

  public static void main(String args[]) {
    A obj = new A(); //using fully qualified name
    obj.msg();
  }
}
/*
Output:
Hello World from package
*/
