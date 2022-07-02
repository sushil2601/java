/*
finally is a MUST execute block used with try block.
*/
class abc
{

public static void main(String s[])
{
	int a;
	try
	{	
	a=Integer.parseInt(s[0]);

	if(a<0)
	throw new ArithmeticException();
	
	System.out.println(a);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Some error");
	}
	finally
	{
	System.out.println("finally block");
	}

	System.out.println("Bye");
}
}
7+26 