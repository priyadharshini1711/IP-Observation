class Sample{
    int a,b;
    Sample(){
        a = 10;
        b = 20;
    }
}

public class Main{
    public static void main (String[] args) {
        Sample s =  new Sample();
        System.out.println("the values are a = "+s.a+" and b : "+s.b);
    }
}