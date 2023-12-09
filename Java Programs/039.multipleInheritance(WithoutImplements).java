import java.io.*;

class Parent1 {

    void fun() {

        System.out.println("Parent1");
    }
}

class Parent2 {

    void fun() {

        System.out.println("Parent2");
    }
}


class Main extends Parent1, Parent2 {

    public static void main(String args[]) {

        Test t = new Test();

        t.fun();
        // throws error as java doesn't support multiple Inheritance
    }
}

/*error
 
 * Main.java:21: error: '{' expected
class Main extends Parent1, Parent2 {
                          ^
1 error
 */