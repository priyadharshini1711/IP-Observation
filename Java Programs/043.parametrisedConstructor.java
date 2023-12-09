class Sample{
    int a,b;
    Sample(int x, int y){
        a = x;
        b = y;
    }
}

public class Main{
    public static void main (String[] args) {
        Sample s =  new Sample(30,40);
        System.out.println("the values are a = "+s.a+" and b : "+s.b);
    }
}

/*
Output:

the values are a = 30 and b : 40
*/