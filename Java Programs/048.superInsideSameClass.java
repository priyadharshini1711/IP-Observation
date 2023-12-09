class Person {

  Person() {
    System.out.println("Person class Constructor");
  }
}

class Student extends Person {

  Student() {
    // invoke or call parent class constructor
    super();
    System.out.println("Student class Constructor");
  }
}

class Main {

  public static void main(String[] args) {
    Student s = new Student();
  }
}
/*
Person class Constructor
Student class Constructor
*/
