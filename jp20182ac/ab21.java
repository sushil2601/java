class abc
{
public static void main(String s[])
{

String s1="hello";
String s2="helzp";

int k=s1.compareTo(s2);
System.out.println(k); //-14

s2="HELLO";
k=s1.compareTo(s2);
System.out.println(k); //32

k=s1.compareToIgnoreCase(s2);
System.out.println(k); //0


}
}