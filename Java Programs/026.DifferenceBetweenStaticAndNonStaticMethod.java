import java.util.*;

public class Main {

  int a, b, c;

  void display() {
    Scanner sc = new Scanner(System.in);
    // a = sc.nextInt() not possible
    System.out.println("Enter two number : ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a + b;
    System.out.println("Sum : " + c);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // a = sc.nextInt() not possible
    System.out.println("Enter two number : ");
    Main m = new Main();
    m.a = sc.nextInt();
    m.b = sc.nextInt();
    m.c = m.a + m.b;
    System.out.println("Sum : " + m.c);

    m.display();
  }
}
/*
output:
Enter two number : 
10
5
Sum : 15
Enter two number : 
10
5
Sum : 15
*/
