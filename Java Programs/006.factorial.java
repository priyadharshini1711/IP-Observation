import java.util.*;

class Main
{
	public static void main(String[] args) {
		int fact = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number \t");
	    int n = sc.nextInt();
	    while(n>1){
	        fact = fact * n;
	        n = n-1;
	    }
	    System.out.println("\nfactorial "+fact);
		sc.close();
	}
}

/*
output:
enter a number 	
5

factorial 120
*/