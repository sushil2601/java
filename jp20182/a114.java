/*
throws keyword
--------------
throws keyword is used by function to declare that function might throw some checked exceptions.
*/
class abc
{
public static void main(String s[]) throws ClassNotFoundException
{
	int a,b,c;
	
	a=Integer.parseInt(s[0]);
	b=Integer.parseInt(s[1]);

	if(b<0)
	throw new ArithmeticException("Negative Value");
	
	if(b>100)
	throw new ClassNotFoundException("Too high value");
	
	c=a/b;
	System.out.println(c);

}
}
