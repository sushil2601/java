class test
{
public static void main(String s[]) throws Exception
{
abc t1=new abc("A");
abc t2=new abc("B");

t1.start();
t2.start();

t1.join(); //wait till t1 finishes
t2.join(); //wait till t2 finishes

System.out.print("Bye main");
}
}