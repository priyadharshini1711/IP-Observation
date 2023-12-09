interface inter {
  int a = 10;
  void display();
}

class Sample implements inter {

  public void display() {
    System.out.println("hello world : " + a);
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    s.display();
  }
}
/*
Output:
hello world : 10
*/
