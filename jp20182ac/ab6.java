class xyz
{

public static void main(String s[])
{
try
{
int a=Integer.parseInt(s[0]);

if(a>100)
 throw new InvalidMarksException("To High Marks");

if(a<0)
 throw new InvalidMarksException("To Low Marks");

System.out.println(a);
}
catch(InvalidMarksException e)
{
 System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println(e);
}

 System.out.println("Bye");

}

}