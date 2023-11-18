class Main {

  public static void main(String[] args) {
    int i = 0;
    for (i = 0; i < 3; i++) {
      System.out.print("inside for loop" + args[i] + "\n");
    }
    System.out.print("out of for loop" + args[1] + "\n");
  }
}
/*
output:
java 005.commandlineArgument.java Hello World Java
inside for loop Hello
inside for loop World
inside for loop Java
outside for loop World
*/
