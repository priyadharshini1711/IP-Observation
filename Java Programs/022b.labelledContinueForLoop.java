public class Main {

  public static void main(String[] args) {
    int i, j;
    labelled_continue1:for (i = 0; i < 3; i++) {
      if (i == 2) {
        continue labelled_continue1;
      }

      System.out.println("values " + i);
    }
    labelled_continue2:for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (j == 2) {
          continue labelled_continue2;
        }
        System.out.println("values " + i + " " + j);
      }
    }
  }
}
/*
output

values 0
values 1
values 0 0
values 0 1
values 1 0
values 1 1
values 2 0
values 2 1
*/
