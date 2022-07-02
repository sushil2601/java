class abc extends Thread
{
String g;

abc(String g)
{
this.g=g;
}

public void run() 
{
try
{
for(int i=1;i<=10;i++)
{
System.out.print(g+"-"+i+"\t");
sleep(1000);
}

System.out.print(g+" finished");;
}
catch(Exception e)
{
e.printStackTrace();
}
}

}