class test
{
public static void main(String s[])
{
abc t1=new abc("A");
abc t2=new abc("B");

t1.start();
t2.start();

for(int i=1;i<=10;i++)
System.out.print("M"+i+"\t");

System.out.print("Bye main");
}
}