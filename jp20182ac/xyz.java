class xyz implements Runnable
{
Thread t;
abcx3 q;

xyz(abcx3 q)
{
this.q=q;
t=new Thread(this);
t.start();
}

public void run()
{
try
{
while(true)
{
  if(q.x<=q.getWidth()-50)
  q.x++;
  q.repaint();
  Thread.sleep(50);
 }
}
catch(Exception e)
{
 e.printStackTrace();
}

}


}