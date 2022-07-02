class xyz
{
public static void main(String s[]) throws Exception
{

abc t1=new abc();
abc t2=new abc();

t1.p.start();
t2.p.start();

t1.p.join();
t2.p.join();


}
}