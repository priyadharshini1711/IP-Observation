import java.util.*;

class Main {

  public static void main(String[] args) {
    try {
      String num = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string (number format)");
      num = sc.next();
      int sum = 1;
      sum = sum + Integer.parseInt(num);
      System.out.println("sum : " + sum);
      sc.close();
    } catch (Exception e) {
      System.out.println("wrong format entered " + e);
    }
  }
}

/*
output1:
enter the string (number format)
5
sum : 6

output2:
enter the string (number format)
a
wrong format entered java.lang.NumberFormatException: For input string: "a"

*/
