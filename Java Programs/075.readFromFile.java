import java.io.*;

public class Main {

  public static void main(String[] args) {
    try {
      FileInputStream fileOutputStream = new FileInputStream(
        "D:\\IP\\Java Programs\\sample1.txt"
      );
      int i = 0;
      while ((i = fileOutputStream.read()) != -1) {
        System.out.print((char) i);
      }
      fileOutputStream.close();
    } catch (Exception e) {
      System.out.println("Error : " + e);
    }
  }
}

/*
Output:
Hi! Hello World!
 */