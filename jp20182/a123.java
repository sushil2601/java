/*

Methods
-------
int length()
char charAt(int)
char[] toCharArray()
byte[] getBytes()
*/

class abc
{
public static void main(String s[])
{

String s1="thisishisdecision"; 

int n=s1.length();
System.out.println(n); //17

char x=s1.charAt(5);
System.out.println(x); //s

char k[]=s1.toCharArray();
for(int i=0;i<k.length;i++)
System.out.print(k[i]+"\t");

System.out.println();

byte b[]=s1.getBytes();
for(int i=0;i<b.length;i++)
System.out.print(b[i]+"\t");

}
}
