class abc
{
public static void main(String s[])
{

StringBuilder s1=new StringBuilder("test");
int n=s1.capacity();
int m=s1.length();

System.out.println(n+","+m);

s1.append("1234567890");
n=s1.capacity();
m=s1.length();

System.out.println(n+","+m);

s1.append("1234567890");
n=s1.capacity();	//(20+1)*2=42
m=s1.length();

System.out.println(n+","+m);

}
}