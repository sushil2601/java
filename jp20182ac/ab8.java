/*
String()
String(char[])
String(char[],int,int)
String(byte[])
String(byte[],int,int)
String(String)
*/
class abc
{

public static void main(String s[])
{

String s1=new String();
System.out.println(s1);

char a[]={'a','b','c','d','e','f','g','h','i','j'};

String s2=new String(a); 
System.out.println(s2);//abcdefghij

String s3=new String(a,2,5); 
System.out.println(s3);//cdefg

byte b[]={65,66,67,68,69,70,71};
String s4=new String(b); 
System.out.println(s4);//ABCDEFG

String s5=new String(b,2,4); 
System.out.println(s5);//CDEF

String s6=new String(s2);
System.out.println(s6);//abcdefghij

String s7="helloworld";
System.out.println(s7);//helloworld

}

}