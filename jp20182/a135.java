/*
boolean startsWith(String)	
boolean endsWith(String)	

*/

class abc
{
public static void main(String s[])
{

String s1="hello world";

System.out.println(s1.startsWith("hell")); //true
System.out.println(s1.startsWith("help")); //false

System.out.println(s1.endsWith("hell")); //false
System.out.println(s1.endsWith("rld")); //true


}
}
