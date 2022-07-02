class xyz
{
public static void main(String s[])
{

abc t1=new abc("A");
abc t2=new abc("B");

t1.start();
t2.start();

while(t1.isAlive()||t2.isAlive());

System.out.print("Main finished");
}
}