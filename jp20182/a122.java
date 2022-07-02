/*

Constructors
------------
String()
String(char[])
String(char[],start,count)
String(byte[])
String(byte[],start,count)
String(String)
*/

class abc
{
public static void main(String s[])
{

String s1=new String(); 
System.out.println(s1);

char x[]={'a','b','c','d','e','f','g','h'};
String s2=new String(x);
System.out.println(s2); //abcdefgh

String s3=new String(x,2,3);
System.out.println(s3); //cde

byte b[]={65,66,67,68,69,70,71,72,73};
String s4=new String(b);
System.out.println(s4); //ABCDEFGHI

String s5=new String(b,3,4);
System.out.println(s5); //DEFG

String s6=new String(s2);
System.out.println(s6); //abcdefgh

String s7="helloworld";
System.out.println(s7); //helloworld





}
}
