/*
boolean equals(String)
boolean equalsIgnoreCase(String)
*/

class abc
{
public static void main(String s[])
{

String s1="helloworld"; 
String s2="helloworld";

boolean n=s1.equals(s2);
System.out.println(n); //true

s2="HELLOWORLD";
n=s1.equals(s2);
System.out.println(n); //false

n=s1.equalsIgnoreCase(s2);
System.out.println(n); //true

}
}
