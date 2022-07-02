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
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array related error");
}
catch(NumberFormatException e)
{
System.out.println("Conversion error");
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic error");
}
catch(Exception e)
{
System.out.println("some error");
}

System.out.println("Bye");


}
}
