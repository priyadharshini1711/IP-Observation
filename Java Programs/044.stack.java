class Stack {

  int top, max;
  int a[] = new int[5];

  Stack() {
    max = 5;
    top = -1;
  }

  void push(int x) {
    top++;

    System.out.println("top and max" + top + " " + max);

    if (top >= max) {
      System.out.println("stack is overflow");
    } else {
      a[top] = x;
    }
  }

  void pop() {
    if (top == -1) {
      System.out.println("stack is underflow");
    } else {
      System.out.println("pop element : " + a[top]);
      top--;
    }
  }

  void peep() {
    if (top == -1) {
      System.out.println("no elements in stack");
    } else {
      System.out.println("peep element : " + a[top]);
    }
  }
}

public class Main {

  public static void main(String[] args) {
    Stack s = new Stack();
    s.pop();
    s.peep();
    s.push(1);
    s.push(2);
    s.peep();
    s.push(3);
    s.pop();
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
  }
}
/*
Output:

stack is underflow
no elements in stack
top and max0 5
top and max1 5
peep element : 2
top and max2 5
pop element : 3
top and max2 5
top and max3 5
top and max4 5
top and max5 5
stack is overflow
*/
