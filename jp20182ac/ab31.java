class abc extends Thread
{
String g;

abc(String g)
{
this.g=g;
}

public void run()
{
System.out.println(g);
}

}