/*
static String valueOf(long)
static String valueOf(double)
static String valueOf(char[])
String concat(String)
*/

class abc
{

public static void main(String s[])
{

String k=String.valueOf(89.21);
System.out.println(k);


char z[]={'a','b','c'};
k=String.valueOf(z);
System.out.println(k);

String p="hello";
String q=p.concat(k);
System.out.println(q);

}

}