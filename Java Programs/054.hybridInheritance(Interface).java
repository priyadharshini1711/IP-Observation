interface inter1 {
  void sum();
}

interface inter2 extends inter1 {
  void average();
}

class GetData {

  int a, b;

  void setData() {
    a = 10;
    b = 20;
  }
}

class Action extends GetData implements inter1, inter2 {

  public void sum() {
    int c = a + b;
    System.out.println("sum of " + a + " and " + b + " = " + c);
  }

  public void average() {
    int c = (a + b) / 2;
    System.out.println("average of " + a + " and " + b + " = " + c);
  }
}

class Main {

  public static void main(String[] args) {
    Action a = new Action();
    a.setData();
    a.sum();
    a.average();
  }
}
/*
Output:
sum of 10 and 20 = 30
average of 10 and 20 = 15

 */
