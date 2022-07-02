class abc
{
public static void main(String s[])
{
int a,b,c;
try
{
	a=Integer.parseInt(s[0]);
	b=Integer.parseInt(s[1]);
	
	c=a/b;
	System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("Error reason "+e.getMessage());
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Error reason "+e.getMessage());
}



System.out.println("Bye");


}
}
