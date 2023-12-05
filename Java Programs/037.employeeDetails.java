import java.util.Scanner;

class Employee {

  String name;
  int id;

  void getEmployeeDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the employee details");
    System.out.print("id : ");
    id = sc.nextInt();
    System.out.println();
    System.out.print("name : ");
    name = sc.next();
  }
}

class Salary extends Employee {

  int dailyAllowance, travelAllowance, houseRentAllowance, lossOfPay, grossPay, extras;

  void calculateSalary() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nenter employee payroll detils");
    System.out.print("daily Allowance : ");
    dailyAllowance = sc.nextInt();
    System.out.print("travel Allowance : ");
    travelAllowance = sc.nextInt();
    System.out.print("house rent Allowance : ");
    houseRentAllowance = sc.nextInt();
    System.out.print("loss of pay in days : ");
    lossOfPay = sc.nextInt();
    System.out.print("extras : ");
    extras = sc.nextInt();
    int pay =
      (dailyAllowance * 30) + travelAllowance + houseRentAllowance + extras;
    int deduction = (lossOfPay * dailyAllowance);
    grossPay = pay - deduction;
  }

  void printDetails() {
    System.out.println("\nsalary details");
    System.out.println("Employee Name : " + name);
    System.out.println("Employee Id : " + id);
    System.out.println("Gross Pay : " + grossPay);
  }
}

public class Main {

  public static void main(String args[]) {
    Salary s = new Salary();
    s.getEmployeeDetails();
    s.calculateSalary();
    s.printDetails();
  }
}
/*
output:
enter the employee details
id : 1

name : sample

enter employee payroll detils
daily Allowance : 1500
travel Allowance : 5000
house rent Allowance : 10000
loss of pay in days : 1
extras : 1500

salary details
Employee Name : sample
Employee Id : 1
Gross Pay : 60000
*/
