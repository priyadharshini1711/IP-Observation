public class Main {

  public static void main(String[] args) {
    int i = 0, j = 0;
    labelled_continue:do {
      do {
        if (i == 3) {
          continue labelled_continue;
        }
        System.out.println("values " + i + " " + j);
        j++;
      } while (j < 5);
      i++;
      j = 0;
    } while (i < 5);
  }
}
/*
ouput:
values 0 0
values 0 1
values 0 2
values 0 3
values 0 4
values 1 0
values 1 1
values 1 2
values 1 3
values 1 4
values 2 0
values 2 1
values 2 2
values 2 3
values 2 4
*/
