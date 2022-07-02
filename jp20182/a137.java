/*
static String valueOf(long)
static String valueOf(double)
static String valueOf(char[])
*/

class abc
{
public static void main(String s[])
{

int a=234;
String s1=String.valueOf(a);
System.out.println(s1); // 234

float a1=1.234f;
String s2=String.valueOf(a1);
System.out.println(s2); // 1.234

char b[]={'a','b','c'};
String s3=String.valueOf(b);
System.out.println(s3); // abc

}
}
