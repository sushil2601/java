class xyz
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
 System.out.println("Some error");

 System.out.println(e);

 e.printStackTrace();

 String p=e.getMessage();
 System.out.println(p);
}

 System.out.println("Bye");

}

}