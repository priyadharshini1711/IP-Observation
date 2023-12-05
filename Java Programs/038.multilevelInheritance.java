import java.util.*;

class GetData {

  int a, b;

  void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length and breadth of cuboid");
    a = sc.nextInt();
    b = sc.nextInt();
    sc.close();
  }
}

class Area extends GetData {

  int s;

  void area() {
    getData();
    s = a * b;
    System.out.println("area : " + s);
  }
}

class Volume extends Area {

  int h, v;

  void volume() {
    Scanner sc = new Scanner(System.in);
    area();
    System.out.println("enter heigth of cuboid");
    h = sc.nextInt();
    v = s * h;
    System.out.println("volume : " + v);
    sc.close();
  }
}

public class Main {

  public static void main(String[] args) {
    Volume v = new Volume();
    v.volume();
  }
}

/*
output:
enter length and breadth of cuboid
4
5
area : 20
enter heigth of cuboid
6
volume : 120
*/
