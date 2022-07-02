class xyz
{
public static void main(String s[])
{

abc t1=new abc("A");
abc t2=new abc("B");

t1.start();
t2.start();

for(int i=1;i<=10;i++)
System.out.print("Main-"+i+"\t");

System.out.print("Main finished");
}
}