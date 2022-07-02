/*
String trim()	
*/

class abc
{
public static void main(String s[])
{

String s1="     hello world   ";

System.out.println(s1);
System.out.println(s1.length());//20

s1=s1.trim();
System.out.println(s1);
System.out.println(s1.length());//11


}
}
