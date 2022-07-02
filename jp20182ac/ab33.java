class abc extends Thread
{
String g;

abc(String g)
{
this.g=g;
}

public void run()
{
for(int i=1;i<=10;i++)
System.out.print(g+"-"+i+"\t");

System.out.print(g+" finished");
}

}