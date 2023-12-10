public class Main {

  public static void main(String[] args) {
    String s1 = new String("Hello World");
    System.out.println(s1);
    String s2 = "Sample";
    System.out.println(s2);
    char a[] = { 'h', 'e', 'l', 'l', 'o' };
    System.out.println(a);
    byte b[] = { 65, 66, 67, 68 };
    System.out.println(b);
    String c = new String(b);
    System.out.println(c);
    String d = "abc";
    System.out.println("length of string " + d + " is " + d.length());
    String e = "this is a lab class";
    System.out.println(e.charAt(3));
    char ch[] = new char[10];
    e.getChars(6, 16, ch, 0);
    System.out.println(ch);
    System.out.println(s1.equals(s2));
    System.out.println(s1.startsWith("He"));
    System.out.println(s1.endsWith("ld"));
    System.out.println(s1.compareTo(s2));
    s1 = s1.replace("o", "t");
    System.out.println(s1);
    s1 = s1.replace("Hellt", "Hello");
    System.out.println(s1);
    String s3 = " Cat ";
    System.out.println(s3);
    s3 = s3.trim();
    System.out.println(s3);
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.concat(s2));
    StringBuilder sbf = new StringBuilder("We are geeks  ");
    System.out.println(sbf);
    char[] astr = new char[] { 'G', 'E', 'E', 'k', 'S' };

    sbf.append(astr);
    System.out.println(sbf);
  }
}
/*
Output:

Hello World
Sample
hello
[B@5fdef03a
ABCD
length of string abc is 3
s
s a lab cl
false
true
true
-11
Hellt Wtrld
Hello Wtrld
 Cat 
Cat
hello wtrld
HELLO WTRLD
Hello WtrldSample
We are geeks  
We are geeks  GEEkS
*/
