class Sample {

  int x = 10, y = 20;

  void sum(int x) {
    this.x = this.y + x;
    System.out.println("sum : " + this.x);
  }
}

class Main {

  public static void main(String[] args) {
    Sample s = new Sample();
    s.sum(20);
  }
}

/*
Output

sum : 40
*/