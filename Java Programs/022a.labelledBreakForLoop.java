public class Main {

  public static void main(String[] args) {
    int i, j;
    labelled_break1:for (i = 0; i < 3; i++) {
      if (i == 2) {
        break labelled_break1;
      }

      System.out.println("values " + i);
    }
    labelled_break2:for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (j == 2) {
          break labelled_break2;
        }
        System.out.println("values " + i + " " + j);
      }
    }
  }
}
/*
output:

values 0
values 1
values 0 0
values 0 1
*/
