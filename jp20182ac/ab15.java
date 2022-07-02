/*
boolean contains(String)
boolean startsWith(String)
boolean endsWith(String)
*/

class abc
{

public static void main(String s[])
{

String s1="this is his decision";

boolean b=s1.contains("aman");
System.out.println(b); //false

b=s1.contains("is");
System.out.println(b); //true

b=s1.startsWith("th");
System.out.println(b); //true

b=s1.endsWith("ion");
System.out.println(b); //true


}

}