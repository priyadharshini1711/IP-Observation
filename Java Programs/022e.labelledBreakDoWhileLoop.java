public class Main {

  public static void main(String[] args) {
    int i = 0;
    labelled_break:do {
      if (i == 3) {
        break labelled_break;
      }
      System.out.println("values " + i);
      i++;
    } while (i < 5);
  }
}
/*
output:
values 0
values 1
values 2
*/
