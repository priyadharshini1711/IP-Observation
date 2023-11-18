import java.io.*;

class Main {

  public static void main(String[] args) {
    int sum, x, i = 1;

    String str = "";

    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    InputStreamReader is = new InputStreamReader(System.in);

    BufferedReader br_new = new BufferedReader(is);

    try {
      System.out.println("enter the string");

      str = br_new.readLine();

      //sum = str + 1; cannot perform this due to TypeNotPresentException

      x = Integer.parseInt(str);

      sum = x + i;

      System.out.println("\nsum:" + sum);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

/*
output:
enter the string
5

sum:6
*/
