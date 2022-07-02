class abc
{

static void f(int x) throws ClassNotFoundException
{
	if(x<0)
	throw new ClassNotFoundException();
	
	System.out.println(x);

	System.out.println("Test");
	
}


public static void main(String s[]) throws ClassNotFoundException
{
	int a;

	a=Integer.parseInt(s[0]);

	f(a);

	System.out.println("Bye");
}
}
