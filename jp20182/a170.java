class test
{
public static void main(String s[]) throws Exception
{
abc t1=new abc("A");
abc t2=new abc("B");

t1.setPriority(3);
t2.setPriority(9); //t2 will be given more time by CPU

t1.start();
t2.start();


}
}