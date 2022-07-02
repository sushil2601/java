/*
int indexOf(int)
int indexOf(int,int)
int indexOf(String)
int indexOf(String,int)

int lastIndexOf(int)
int lastIndexOf(int,int)
int lastIndexOf(String)
int lastIndexOf(String,int)
*/

class abc
{
public static void main(String s[])
{

String s1="thisishisdecision"; 

int n;

n=s1.indexOf('s');
System.out.println(n); //3

n=s1.indexOf('s',6);
System.out.println(n); //8

n=s1.indexOf("is");
System.out.println(n); //2

n=s1.indexOf("is",6);
System.out.println(n); //7

n=s1.lastIndexOf('s');
System.out.println(n); //13

n=s1.lastIndexOf('s',6);
System.out.println(n); //5

n=s1.lastIndexOf("is");
System.out.println(n); //12

n=s1.lastIndexOf("is",6);
System.out.println(n); //4

n=s1.indexOf('z');
System.out.println(n); //-1


}
}
