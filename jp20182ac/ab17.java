/*
int lastIndexOf(int)
int lastIndexOf(int,int)
int lastIndexOf(String)
int lastIndexOf(String,int)
*/

class abc
{

public static void main(String s[])
{

String s1="this is his decision";

int n=s1.lastIndexOf('i');
System.out.println(n); //17

n=s1.lastIndexOf('i',11);
System.out.println(n); //9

n=s1.lastIndexOf("is");
System.out.println(n); //15

n=s1.lastIndexOf("is",11);
System.out.println(n); //9


}

}