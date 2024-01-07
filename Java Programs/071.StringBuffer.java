class Sample {

  void concatenate1(String s) {
    s = s + " World!";
  }

  void concatenate2(StringBuffer r) {
    r.append(" World!");
  }
}

class Main {

  public static void main(String[] args) {
    Sample obj = new Sample();
    String s1 = "hello";
    StringBuffer s2 = new StringBuffer("Beautiful");
    obj.concatenate1(s1);
    obj.concatenate2(s2);
    System.out.println(s1);
    System.out.println(s2);
  }
}
/*
Output:

hello
Beautiful World!
*/
