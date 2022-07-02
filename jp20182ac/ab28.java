class abc
{
public static void main(String s[])
{

StringBuilder s1=new StringBuilder("helloworld");
s1.insert(7,'q');

System.out.println(s1);

s1.delete(5,8);
System.out.println(s1);

s1.reverse();
System.out.println(s1);

}
}