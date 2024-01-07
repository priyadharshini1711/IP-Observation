class Sample extends Thread{
    public void run(){
        System.out.println("this is the thread");
    }
} 

class Main{
    public static void main (String[] args) {
        Sample s = new Sample();
        s.start();
        new Sample().start();
    }
}
/*
Output:
this is the thread
this is the thread
*/