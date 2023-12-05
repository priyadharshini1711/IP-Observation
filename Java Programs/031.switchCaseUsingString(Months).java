import java.util.*;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "enter the first three letters of the string in capital letter"
    );
    String month = sc.next();
    switch (month) {
      case "JAN":
        System.out.println("01 January ");
        break;
      case "FEB":
        System.out.println("02 February ");
        break;
      case "MAR":
        System.out.println("03 March ");
        break;
      case "APR":
        System.out.println("04 April ");
        break;
      case "MAY":
        System.out.println("05 May ");
        break;
      case "JUN":
        System.out.println("06 June ");
        break;
      case "JUL":
        System.out.println("07 July ");
        break;
      case "AUG":
        System.out.println("08 August ");
        break;
      case "SEP":
        System.out.println("09 September ");
        break;
      case "OCT":
        System.out.println("10 October ");
        break;
      case "NOV":
        System.out.println("11 November ");
        break;
      case "DEC":
        System.out.println("12 December ");
        break;
      default:
        System.out.println("invalid selection");
        break;
    }
  }
}
/*
output1:

enter the first three letters of the string in capital letter
JAN
01 January 

output2:
enter the first three letters of the string in capital letter
AUG
08 August 

output3:
enter the first three letters of the string in capital letter
oct
invalid selection
*/
