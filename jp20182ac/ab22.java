/*
equals : compares two strings character by character
== : compares references of two strings
*/

class abc
{
public static void main(String s[])
{

String s1=new String("hello");
String s2=s1;

System.out.println(s1); //hello
System.out.println(s2); //hello

boolean b=s1.equals(s2);
System.out.println(b); //true
System.out.println(s1==s2); //true

String s3=new String(s1);
b=s1.equals(s3);
System.out.println(b); //true
System.out.println(s1==s3); //false

}
}