class xyz
{
public static void main(String s[]) throws Exception
{

abc t1=new abc("A");
abc t2=new abc("B");

t1.start();
t2.start();

Thread.sleep(5000); //puts current thread in sleep mode for 5 secs
System.out.print("Main finished");
}
}