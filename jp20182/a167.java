class abc extends Thread
{
String k;

abc(String k)
{
this.k=k;
}

public void run() 
{

try
{
for(int i=1;i<=10;i++)
{
System.out.print(k+"-"+i+"\t");
sleep(1000);
}
}
catch(Exception e)
{
e.printStackTrace();
}

System.out.print("Bye "+k);
}

}