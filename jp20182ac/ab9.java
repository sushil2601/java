/*
int length()
char charAt(int)
char[] toCharArray()
byte[] getBytes()
*/
class abc
{

public static void main(String s[])
{

String s1="helloworld";
int n=s1.length();

System.out.println(n);//10

char t=s1.charAt(8);
System.out.println(t);//l

char z[]=s1.toCharArray();
for(int i=0;i<z.length;i++)
 System.out.print(z[i]+"\t");

System.out.println();

byte y[]=s1.getBytes();
for(int i=0;i<y.length;i++)
 System.out.print(y[i]+"\t");



}

}