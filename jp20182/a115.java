class abc
{

static void f(int x)
{
	if(x<0)
	throw new ArithmeticException();
	
	System.out.println(x);

	System.out.println("Test");
	
}

public static void main(String s[])
{
	int a;

	a=Integer.parseInt(s[0]);

	f(a);

	System.out.println("Bye");
}
}
