class abc extends Thread
{
String k;

abc(String k)
{
this.k=k;
}

public void run() 
{

for(int i=1;i<=10;i++)
{
System.out.print(k+"-"+i+"\t");
}

System.out.print("Bye "+k);
}

}