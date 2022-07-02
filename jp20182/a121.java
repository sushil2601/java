/*
Custom or User defined exceptions
---------------------------------
We can create oour own exceptions by extending Exception class.
User defined exceptions are treated as Checked exceptions.
*/

class abc extends Exception
{


}

class xyz
{
public static void main(String s[]) throws abc
{

int a=Integer.parseInt(s[0]);
if(a<0)
throw new abc();

System.out.println(a);

}
}
