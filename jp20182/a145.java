
class abc
{

public static void main(String s[])
{

try
{
int a=Integer.parseInt(s[0]);

System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("some error "+e);
}

System.out.println("Bye");
}

}
