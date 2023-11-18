import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value");
      String value = sc.next();
      System.out.println("The value is "+ value);
      System.out.println("Enter a integer value");
      int valueInt = sc.nextInt();
      System.out.println("The value is "+ valueInt);
      sc.close();
    }
}

/*
Output

STDIN
abc
20

Output:

Enter a string value
The value is abc
Enter a integer value
The value is 20
 */