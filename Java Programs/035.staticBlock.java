class Sample {
  static {
    System.out.println("this is static block of sample class");
  }
}

class Example {

  void display() {
    System.out.println("this is member function of Example class");
  }

  static {
    System.out.println("this is static block of Example class");
  }
}

public class Main {

  public static void main(String args[]) {
    Example e = new Example();
    e.display();
  }

  static {
    System.out.println("this is static block of main class");
  }
}
/*
output:

this is static block of main class
this is static block of Example class
this is member function of Example class
*/
