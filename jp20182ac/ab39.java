class xyz
{
public static void main(String s[])
{

abc t1=new abc("A");
abc t2=new abc("B");

System.out.println(t1);
System.out.println(t2);

int n;
n=t1.getPriority();
System.out.println(n);

String k=t1.getName();
System.out.println(k);

t1.setPriority(8);
t1.setName("Test");

System.out.println(t1);

Thread y=Thread.currentThread();
System.out.println(y);

y.setPriority(3);
y.setName("abcdef");

System.out.println(y);

y.setPriority(Thread.MAX_PRIORITY);
System.out.println(y);

y.setPriority(Thread.MIN_PRIORITY);
System.out.println(y);

y.setPriority(Thread.NORM_PRIORITY);
System.out.println(y);

y.setPriority(Thread.NORM_PRIORITY-2);
System.out.println(y);

}
}