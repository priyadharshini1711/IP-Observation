public class Main {

  public static void main(String[] args) {
    int i = 0;
    labelled_break:while (i < 5) {
      if (i == 3) {
        break labelled_break;
      }
      System.out.println("values " + i);
      i++;
    }
  }
}
/*
output

values 0
values 1
values 2
*/
