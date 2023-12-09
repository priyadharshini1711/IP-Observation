interface inter1 {
  int a = 10, b = 20;
  void sum();
}

interface inter2 extends inter1 {
  int c = 30;
  void avg();
}

class Sample implements inter1, inter2 {

  int x;

  public void sum() {
    x = a + b + c;
    System.out.println("sum : " + x);
  }

  public void avg() {
    x = x / 3;
    System.out.println("avg : " + x);
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    s.sum();
    s.avg();
  }
}
/*
Output:
sum : 60
avg : 20
*/
 