class test
{
public static void main(String s[]) throws Exception
{
abc t1=new abc("A");
abc t2=new abc("B");

System.out.println(t1);
System.out.println(t2);

int n=t1.getPriority();
System.out.println(n);

n=t2.getPriority();
System.out.println(n);

String x=t1.getName();
System.out.println(x);

x=t2.getName();
System.out.println(x);

t1.setPriority(3);
t2.setPriority(9);

t1.setName("aaa");
t2.setName("bbb");

System.out.println(t1);
System.out.println(t2);

}
}