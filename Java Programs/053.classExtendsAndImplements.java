interface inter1 {
  int a = 10, b = 20;
  void sum();
}

class Sample {

  int x, y;

  void setData() {
    x = 30;
    y = 40;
  }
}

class Example extends Sample implements inter1 {

  int z;

  public void sum() {
    z = a + b + x + y;
    System.out.println("interface and class members sum " + z);
  }
}

class Main {

  public static void main(String[] args) {
    Example e = new Example();
    e.setData();
    e.sum();
  }
}
/*
Output:

interface and class members sum 100
*/
