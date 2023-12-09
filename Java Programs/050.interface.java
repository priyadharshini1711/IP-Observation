interface Sample1 {
  public void display();
}

interface Sample2 {
  public void put();
}

class Sample3 implements Sample1, Sample2 {

  public void put() {
    System.out.println("hi");
  }

  public void display() {
    System.out.println("hello world");
  }
}

class Main {

  public static void main(String[] args) {
    Sample3 s = new Sample3();
    s.put();
    s.display();
  }
}
/*
Output:
hi
hello world
*/
