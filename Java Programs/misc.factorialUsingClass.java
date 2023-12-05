public class Factorial {
    void factorial(){
        int n;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter a value");
         n = sc.nextInt();
         int i;
         int fact = 1;
         for(i=1;i<=n;i++){
            fact *= i;
         }
    }
    
}

public class Main(){
    public static void main(String args[]){
        Factorial f = new Factorial();
        f.factorial();
    }
}