import java.util.*;

class Main {

  static void search() {
    String str[] = { "hi", "hello", "good", "welcome", "morning" };
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string to search : ");
    s = sc.next();
    int i;
    for (i = 0; i < str.length; i++) {
      if (str[i].equals(s)) {
        System.out.println("found the word " + s + " at index " + i);
        break;
      }
    }
    if (i == str.length) System.out.println("cannot find the word");
  }

  public static void main(String[] args) {
    search();
  }
}
/*
Output1:
enter string to search : 
morning
found the word morning at index 4

Output2:
enter string to search : 
sa
cannot find the word
*/
