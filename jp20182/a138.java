/*
String[] split(String)
*/

class abc
{
public static void main(String s[])
{

String k="hello.world.test";

String m[]=k.split("\\.");

for(int i=0;i<m.length;i++)
System.out.println(m[i]);

}
}
