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
catch(Exception e)
{
System.out.println("some error");
}

System.out.println("Bye");


}
}

