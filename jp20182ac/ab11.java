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

String s1="hElLowoRlD";
	
char x[]=s1.toCharArray();
int c=0;

for(int i=0;i<x.length;i++)
{
if(x[i]>='A' && x[i]<='Z')
  c++;

}

System.out.println(c);



}

}