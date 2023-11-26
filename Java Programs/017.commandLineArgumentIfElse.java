class Main {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("no elements are found");
    } else {
      int i;
      for (i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
    }
  }
}
/*
output
no elements are found
*/
