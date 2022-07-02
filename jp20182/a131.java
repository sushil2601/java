/*
int compareTo(String)
int compareToIgnoreCase(String)
*/

class abc
{
public static void main(String s[])
{

String s1="helloworld"; 
String s2="hellotest";

int n=s1.compareTo(s2);
System.out.println(n);

s2="HELLOWORLD";
n=s1.compareTo(s2);
System.out.println(n);

n=s1.compareToIgnoreCase(s2);
System.out.println(n);

}
}
