class xyz
{
public static void main(String s[])
{

abc t1=new abc("A");
abc t2=new abc("B");

t1.setPriority(Thread.NORM_PRIORITY+2);
t2.setPriority(Thread.NORM_PRIORITY-2);

t1.start();
t2.start();


}
}