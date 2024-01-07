import java.io.FileOutputStream;

public class Main {

  public static void main(String[] args) {
    try {
      FileOutputStream fOutputStream = new FileOutputStream(
        "D:\\IP\\Java Programs\\sample.txt"
      );
      String str = "Welocome! Hello World.";
      byte array[] = str.getBytes();
      fOutputStream.write(array);
      fOutputStream.close();
    } catch (Exception e) {
      System.err.println("Error: " + e);
    }
  }
}
