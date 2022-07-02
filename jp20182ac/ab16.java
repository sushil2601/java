/*
int indexOf(int)
int indexOf(int,int)
int indexOf(String)
int indexOf(String,int)
*/

class abc
{

public static void main(String s[])
{

String s1="this is his decision";

int n=s1.indexOf('i');
System.out.println(n); //2

n=s1.indexOf('i',6);
System.out.println(n); //9

n=s1.indexOf("is");
System.out.println(n); //2

n=s1.indexOf("is",6);
System.out.println(n); //9


}

}