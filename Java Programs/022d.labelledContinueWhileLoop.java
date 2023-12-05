public class Main {

  public static void main(String[] args) {
    int i = 0, j = 0;
    labelled_continue:while (i < 5) {
      System.out.println("values of i " + i);
      while (j < 5) {
        System.out.println("values " + i + " " + j);
        if (i == 2) {
          continue labelled_continue;
        }

        j++;
      }
      i++;
    }
  }
}
/*
output:

values of i 0
values 0 0
values 0 1
values 0 2
values 0 3
values 0 4
values of i 1
values of i 2
values of i 3
values of i 4

*/
