/*
String replace(char,char)
String concat(String)
*/

class abc
{
public static void main(String s[])
{

String s1="helloworld"; 

String s2=s1.replace('l','z');
System.out.println(s2);

String s3="test";

String s4=s1.concat(s3);
System.out.println(s4); //helloworldtest

s4=s1.concat("bye");
System.out.println(s4); //helloworldbye


}
}
