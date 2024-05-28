class Main {

  int id;
  String name;

  Main(int i, String n) {
    id = i;
    name = n;
  }

  void display() {
    System.out.println(id + " " + name);
  }

  public static void main(String args[]) {
    Main s1 = new Main(111, "Karan");
    Main s2 = new Main(222, "Aryan");
    s1.display();
    s2.display();
  }
}

/*
Output:

111 Karan
222 Aryan
*/
