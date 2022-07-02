class abc implements Runnable
{

Thread p;

abc()
{
p=new Thread(this);
}

public void run()
{
try
{
System.out.println("hello");
Thread.sleep(5000);
System.out.println("world");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}