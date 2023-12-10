abstract class Sample {

  public abstract void display();
}

class Example extends Sample {

  public void display() {
    System.out.println("Hello World");
  }
}

class Main {

  public static void main(String[] args) {
    Example obj = new Example();
    obj.display();
  }
}
/*
Output:

Hello World
*/
