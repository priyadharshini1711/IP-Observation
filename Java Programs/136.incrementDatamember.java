class A {
	protected void method()
	{
		System.out.println("Hello");
	}
}

public class Main extends A {

	public void method()
	{
		System.out.println("Hello");
	}

	public static void main(String args[])
	{
		Main b = new Main();
		b.method();
	}
}

/*
Output:

Hello
*/
