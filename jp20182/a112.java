/*
throw
-----
throw keyword is used to throw an exception explicitly
*/

class abc
{
public static void main(String s[])
{
	int a,b,c;

	a=Integer.parseInt(s[0]);
	b=Integer.parseInt(s[1]);

	if(b<0)
	throw new ArithmeticException("Negative Value");
	
	if(b>100)
	throw new NumberFormatException("Too high value");
	
	c=a/b;
	System.out.println(c);

}
}
